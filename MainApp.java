import java.util.Scanner;
public class MainApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial capacity :");
        int n = sc.nextInt();
        Stack.create(n);
        System.out.println("Stack is ready");

        while(true)
        {
            System.out.println("1. push"); // check stack is empty is not
            System.out.println("2.  pop");
            System.out.println("3. peek");
            System.out.println("4. traverse");
            System.out.println("5  exit");

            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            if(ch == 1)
            {
                System.out.println("Enter the element :");
                int ele = sc.nextInt();
                Stack.push(ele);
            }
            else if(ch == 2)
            {
                int item = Stack.pop();
                if(item == -1)
                {
                    System.out.println("Stack is underflow");
                }
                else
                {
                    System.out.println("popped" + item);

                }

            }
            else if(ch == 3)
            {
                int item = Stack.peek();
                if(item == -1)
                {
                    System.out.println("Stack is underflow");
                }
                else
                {
                    System.out.println("peek" + item);

                }
            }
            else if(ch == 4)
            {
                Stack.traverse();
            }
            else if(ch == 5)
            {
                break;
            }
        }
    }
}
class Stack
{
    static int[] stk;
    static int top = -1;
    static int size;
    static void create(int n)
    {
        size = n;
        stk = new int[size];
    }
    static void push(int ele)
    {
        if(isFull())
        {
            System.out.println("Stack is overflow");
        }
        else
        {
            ++top;
            stk[top] = ele;
            System.out.println("Element Pushed");

        }
    }
    static boolean isFull()
    {
        if(top == size -1)
        {
            return true;

        }
        else
        {
            return false;

        }
    }
    static int pop ()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            return stk[top --];
        }

    }
    static boolean isEmpty()
    {
        if (top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            return stk[top];
        }
    }
    static void traverse()
    {
        if(isEmpty())
        {
            System.out.println("Stack is underflow");
        }
        else
        {
            System.out.println("The stack elements are:");
            for(int i = 0; i<=top ; i++)
            {
                System.out.println(stk[i]);
            }
        }
    }
}