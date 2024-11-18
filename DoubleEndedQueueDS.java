public class DoubleEndedQueueDS {
    static int[] dq;
    static int front = -1, rear = -1, size;

    public static void main(String[] args) {
        create(5);
        insertFront(10);
        insertRear(20);
        deleteFront();
        deleteRear();
        traverse();
    }

    static void create(int n) {
        dq = new int[n];
        size = n;
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

    static void traverse() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Elements in the queue:");
            int i = front;
            while (i != rear) {
                System.out.print(dq[i] + " ");
                i = (i + 1) % size;
            }
            System.out.println(dq[rear]);
        }
    }

    static boolean isEmpty() {
        return front == -1;
    }

    static boolean isFull() {
        return (front == 0 && rear == size - 1) || (front == rear + 1);
    }
}
