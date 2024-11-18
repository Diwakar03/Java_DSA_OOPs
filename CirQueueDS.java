import java.util.Scanner;

class CircularQueue {
    private int[] queue;
    private int front, rear, maxSize;

    public CircularQueue(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue item.");
        } else {
            if (isEmpty())
                front = rear = 0;
            else
                rear = (rear + 1) % maxSize;
            queue[rear] = item;
            System.out.println("Enqueued " + item + " successfully.");
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue item.");
            return -1;
        } else {
            int item = queue[front];
            if (front == rear)
                front = rear = -1;
            else
                front = (front + 1) % maxSize;
            System.out.println("Dequeued " + item + " successfully.");
            return item;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements:");
            int i = front;
            do {
                System.out.print(queue[i] + " ");
                i = (i + 1) % maxSize;
            } while (i != rear);
            System.out.println();
        }
    }
}

public class CirQueueDS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the circular queue: ");
        int maxSize = scanner.nextInt();

        CircularQueue queue = new CircularQueue(maxSize);

        while (true) {
            System.out.println("\nCircular Queue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to enqueue: ");
                    int item = scanner.nextInt();
                    queue.enqueue(item);
                    break;
                case 2:
                    int dequeuedItem = queue.dequeue();
                    if (dequeuedItem != -1)
                        System.out.println("Dequeued item: " + dequeuedItem);
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
