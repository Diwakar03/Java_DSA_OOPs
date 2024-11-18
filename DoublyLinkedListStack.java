import java.util.Scanner;

public class DoublyLinkedListStack {
    static Node root = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Append");
            System.out.println("2. Display");
            System.out.println("3. Length");
            System.out.println("4. AddFirst");
            System.out.println("5. addAfter");
            System.out.println("6. Search");
            System.out.println("7. deleteFirst");
            System.out.println("8. deleteAfter");
            System.out.println("9. swapData");
            System.out.println("10. Exit");

            System.out.println("Enter your choice");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter element to add:");
                    int ele = sc.nextInt();
                    append(ele);
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    int len = length();
                    System.out.println("List length is:" + len);
                    break;
                case 4:
                    System.out.println("Enter element to add at First:");
                    ele = sc.nextInt();
                    addFirst(ele);
                    break;
                case 5:
                    System.out.println("Enter element to insert:");
                    ele = sc.nextInt();

                    System.out.println("Enter location to insert:");
                    int loc = sc.nextInt();
                    addAfter(loc, ele);
                    break;
                case 6:
                    System.out.println("Enter element to Search:");
                    ele = sc.nextInt();
                    search(ele);
                    break;
                case 7:
                    deleteFirst();
                    break;
                case 8:
                    System.out.println("Enter location to delete:");
                    loc = sc.nextInt();
                    deleteAfter(loc);
                    break;
                case 9:
                    System.out.println("Enter location1 to swap:");
                    int loc1 = sc.nextInt();

                    System.out.println("Enter location2 to swap:");
                    int loc2 = sc.nextInt();
                    swapData(loc1, loc2);
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice:");
            }
        }
    }

    static void append(int ele) {
        Node newNode = new Node();
        newNode.data = ele;
        if (root == null) {
            root = newNode;
        } else {
            Node last = root;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;
        }
        System.out.println("Appended to list");
    }

    static void display() {
        if (root == null) {
            System.out.println("List empty");
        } else {
            System.out.println("List is:");
            Node temp = root;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    static int length() {
        Node temp = root;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    static void addFirst(int ele) {
        Node newNode = new Node();
        newNode.data = ele;
        newNode.next = root;
        if (root != null) {
            root.prev = newNode;
        }
        root = newNode;
    }

    static void addAfter(int loc, int ele) {
        int len = length();
        if (loc > 0 && loc <= len) {
            Node temp = new Node();
            temp.data = ele;

            int i = 0;
            Node target = root;
            while (i < loc) {
                target = target.next;
                i++;
            }
            temp.next = target.next;
            if (target.next != null) {
                target.next.prev = temp;
            }
            target.next = temp;
            temp.prev = target;
            System.out.println("Is added");
        } else {
            System.out.println("Error: Invalid loc, list has only " + len + " nodes");
        }
    }

    static void search(int ele) {
        Node temp = root;
        boolean found = false;
        while (temp != null) {
            if (temp.data == ele) {
                System.out.println("Found the element");
                found = true;
                break;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }

    static void deleteFirst() {
        if (root == null)
            System.out.println("List is empty");
        else {
            root = root.next;
            if (root != null)
                root.prev = null;
        }
    }

    static void deleteAfter(int loc) {
        int len = length();
        if (loc >= 1 && loc < len) {
            int i = 1;
            Node p = root;
            while (i < loc) {
                p = p.next;
                i++;
            }
            Node q = p.next;
            p.next = q.next;
            if (q.next != null) {
                q.next.prev = p;
            }
            q.next = null;
            q.prev = null;
            System.out.println("Deleted");
        } else {
            System.out.println("Invalid location given");
        }
    }

    static void swapData(int loc1, int loc2) {
        int len = length();
        if (loc1 >= 1 && loc1 <= len && loc2 >= 1 && loc2 <= len && loc1 != loc2) {
            Node p = root, q = root;
            int i = 1;
            while (i < loc1) {
                p = p.next;
                i++;
            }
            i = 1;
            while (i < loc2) {
                q = q.next;
                i++;
            }
            int temp = p.data;
            p.data = q.data;
            q.data = temp;
            System.out.println("Data swapped successfully");
        } else {
            System.out.println("Invalid locations given or same locations provided");
        }
    }

    static class Node {
        int data;
        Node prev, next;
    }
}
