public class LinkedList {
    Node head; // head of the list

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Method to reverse the linked list
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;   // Store the next node
            current.next = previous; // Reverse the current node's pointer
            previous = current;    // Move pointers one position ahead
            current = next;
        }
        head = previous; // Update head to the new front of the list
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        list.printList();

        list.reverse();

        System.out.println("Reversed Linked List:");
        list.printList();
    }
}
