import java.util.Scanner;

public class StackUsingLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node top = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, data;

        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Traverse");
            System.out.println("4. Peek");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to push: ");
                    data = sc.nextInt();
                    push(data);
                    break;
                case 2:
                    data = pop();
                    if (data != -1) {
                        System.out.println("Popped element: " + data);
                    }
                    break;
                case 3:
                    traverse();
                    break;
                case 4:
                    data = peek();
                    if (data != -1) {
                        System.out.println("Top element: " + data);
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public static int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        Node temp = top;
        int data = temp.data;
        top = top.next;
        return data;
    }

    public static void traverse() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
}
