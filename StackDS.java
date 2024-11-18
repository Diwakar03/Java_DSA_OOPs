import java.util.Scanner;
public class StackDS
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial capacity of stack: ");
        int size = sc.nextInt();

        int[] stack = new int[size]; // name of array we used stack
        // inverted array is stack with a rule, if we want to insert or delete we need to perform from top
        int top = -1; // value of top when no item is there
        while(true)
        {
            System.out.println("1. push"); // check stack is empty is not
            System.out.println("2.  pop");
            System.out.println("3. peek");
            System.out.println("4. traverse");
            System.out.println("5  exit");

            System.out.println("Enter your choice");
            int ch = sc.nextInt();

            if(ch ==1)
            {
                if(top == size-1)
                {
                    System.out.println("Stack is full");
                    size = size*2;
                    int[] arr = new int[size];
                    for(int i = 0; i<=top ; i++)
                    {
                        arr[i] = stack[i];
                    }
                    stack = arr;
                    int ele = sc.nextInt();
                    System.out.println("Element to be pushed:");
                    top++;
                    stack[top] = ele;
                    System.out.println("Element pushed");
                }
                else
                {
                    System.out.println("Element the element");
                    int ele = sc.nextInt();
                    top++;
                    stack[top] = ele; // stack[++top] = ele; first increse vale of top n store
                    System.out.println("Element push");
                }
            }
            else if(ch == 2)
            {
                if(top == -1)
                {
                    System.out.println("Stack is underflow");
                }
                else
                {
                    System.out.println("popped" + stack[top]);
                    top --;
                    //really didnt deleted , if we push its modified and user cannot see it thats it

                }

            }
            else if(ch ==3)
            {
                if(top == -1)// peek means display top element
                {
                    System.out.println("Stack is underflow");
                }
                else
                {
                    System.out.println("Peek" + stack[top]);
                }
            }
            else if(ch ==4)
            { // display elements
                if(top == -1)
                {
                    System.out.println("Stack is underflow");
                }
                else
                {
                    System.out.println("Stack elements are :");
                    for(int i =0; i<=top; i++)
                    {
                        System.out.println(stack[i]);
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