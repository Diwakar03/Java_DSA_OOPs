import java.util.Scanner;
public class QueueDS
{
    // if u want to perform deletion use front and if insert use rear
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial capacity of Queue: ");
        int size = sc.nextInt();

        int[] queue = new int[size];
        final int front = 0;
        int rear = 0;
        while(true)
        {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. peek");
            System.out.println("4. traverse");
            System.out.println("5  exit");

            System.out.println("Enter your choice");
            int ch = sc.nextInt();

            if(ch ==1)
            {
                if(rear == size)
                {
                    System.out.println("Queue is full");
                }
                else
                {
                    System.out.println("Element the insert");
                    int ele = sc.nextInt();
                    queue[rear++] = ele;
                    System.out.println("Element inserted");
                }
            }
            else if(ch == 2)
            {
                if(rear == 0)
                {
                    System.out.println("Queue is empty");
                }
                else
                {
                    System.out.println("Deleted :" + queue[front]);
                    for(int i = 0; i<=rear -2; i++)
                    {
                        queue[i] = queue[i+1];
                    }
                    rear --;
                }

            }
            else if(ch ==3)
            {
                if(rear == 0)// peek means display top element
                {
                    System.out.println("queue is empty");
                }
                else
                {
                    System.out.println("Peek" + queue[front]);
                }
            }
            else if(ch ==4)
            { // display elements
                if(rear == 0)
                {
                    System.out.println("Queue is empty");
                }
                else
                {
                    System.out.println("Queue elements are :");
                    for(int i =front; i<=rear-1; i++)
                    {
                        System.out.println(queue[i]);
                    }
                }
            }
            else if(ch == 5)
            {
                break;

            }
            else
            {
                System.out.println("Invalid choice");
            }
        }
    }
}