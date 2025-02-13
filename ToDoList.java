import java.util.*;

public class ToDoList {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Tasklist = new ArrayList<>(); 

        while(true)
        {
            System.out.println("ToDo List Application \n");
            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Mark as Done");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit Application\n");
            System.out.println("Please Enter your choice: ");

            int choice  = sc.nextInt();

            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the task: ");
                    String task = sc.next();
                    Tasklist.add(task);
                    System.out.println("Task Added!");
                    break;
                }
                case 2:
                {
                    if(Tasklist.isEmpty())
                    {
                        System.out.println("No Task Added :)");
                    }
                    else
                    {
                        System.out.println("The list of Tasks: ");
                        for(int i = 0; i<Tasklist.size(); i++)
                        {
                            System.out.println((i+1)+ ". "+ Tasklist.get(i));
                        }
                        break;
                    }
                    break;
                }
                case 3:
                {
                    if(Tasklist.isEmpty())
                    {
                        System.out.println("No Task to be Deleted :)");
                    }
                    else
                    {
                        System.out.println("Enter the task number to mark completed ");
                        int tasknum = sc.nextInt();
                        if(tasknum > 0 && tasknum <= Tasklist.size())
                        {
                            Tasklist.set(tasknum-1, "Done  " + Tasklist.get(tasknum-1));
                            System.out.println("Task marked as completed!");
                        } 
                        else 
                        {
                            System.out.println("Invalid task number.");
                        }   
                    }
                    break;
                }
                case 4:
                {
                    if(Tasklist.isEmpty())
                    {
                        System.out.println("No Task to be Deleted :)");
                    }
                    else
                    {
                        System.out.println("Enter the task number to be Deleted ");
                        int tasknum = sc.nextInt();
                        if(tasknum>0 && tasknum<=Tasklist.size())
                        {
                            Tasklist.remove(tasknum-1);
                            System.out.println("Task Deleted!! ");
                        }
                        else
                        {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;
                }
                case 5:
                {
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;
                }
                default:
                {
                    System.out.println("Invalid option!  Please choose again");
                }
            }


        }

    }
}
