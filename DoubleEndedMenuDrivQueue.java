import java.util.Scanner;

public class DoubleEndedMenuDrivQueue {
    static int[] dq;
    static int front = -1, rear = -1, size;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Double Ended Queue Operations:");
            System.out.println("1. Create a deque");
            System.out.println("2. Insert element at front");
            System.out.println("3. Insert element at rear");
            System.out.println("4. Delete element from front");
            System.out.println("5. Delete element from rear");
            System.out.println("6. Traverse deque");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the size of the deque: ");
                    int n = scanner.nextInt();
                    create(n);
                    break;
                case 2:
                    System.out.print("Enter the element to insert at front: ");
                    int frontElement = scanner.nextInt();
                    insertFront(frontElement);
                    break;
                case 3:
                    System.out.print("Enter the element to insert at rear: ");
                    int rearElement = scanner.nextInt();
                    insertRear(rearElement);
                    break;
                case 4:
                    deleteFront();
                    break;
                case 5:
                    deleteRear();
                    break;
                case 6:
                    traverse();
                    break;
                case 7:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 7);

        scanner.close();
    }

    static void create(int n) {
        dq = new int[n];
        size = n;
        System.out.println("Deque created with size " + n);
    }

    static void insertFront(int ele) {
        if (isFull()) {
            System.out.println("Queue overflow");
        } else {
            if (front == -1) {
                front = rear = 0;
            } else if (front == 0) {
                front = size - 1;
            } else {
                front--;
            }
            dq[front] = ele;
            System.out.println("Element inserted at front: " + ele);
        }
    }

    static void deleteFront() {
        if (isEmpty()) {
            System.out.println("Underflow");
        } else {
            System.out.println("Deleted " + dq[front]);
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
        }
    }

    static void insertRear(int ele) {
        if (isFull()) {
            System.out.println("Queue overflow");
        } else {
            if (front == -1) {
                front = rear = 0;
            } else if (rear == size - 1) {
                rear = 0;
            } else {
                rear++;
            }
            dq[rear] = ele;
            System.out.println("Element inserted at rear: " + ele);
        }
    }

    static void deleteRear() {
        if (isEmpty()) {
            System.out.println("Underflow");
        } else {
            System.out.println("Deleted " + dq[rear]);
            if (front == rear) {
                front = rear = -1;
            } else if (rear == 0) {
                rear = size - 1;
            } else {
                rear--;
            }
        }
    }

    static boolean isEmpty() {
        return front == -1;
    }

    static boolean isFull() {
        return (front == 0 && rear == size - 1) || (front == rear + 1);
    }

    static void traverse() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
        } else {
            System.out.print("Deque elements: ");
            int i = front;
            do {
                System.out.print(dq[i] + " ");
                i = (i + 1) % size;
            } while (i != (rear + 1) % size);
            System.out.println();
        }
    }
}
