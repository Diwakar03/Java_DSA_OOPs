public class PW_LL01 {

    public static void displayrecursion(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data + " ");
        displayrecursion(head.next);
    }

    public static int length(Node head){
        int c = 0;
        while(head!=null){
            c++;
            head = head.next;
        }
        return c;
    }

//    public static class LinkedList(Node head){
//        Node head = null;
//        Node tail = null;
//        void insertAtEnd(Node head){
//            Node temp = new Node(int val);
//            if(head==null){
//                temp = head;
//            }
//            else {
//                tail = temp.next;
//            }
//            tail = temp;
//        }
//        void disp(){
//            Node temp = head;
//            while(temp!=null){
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            }
//        }
//    }

    public static void displayreverse(Node head){
        if(head==null){
            return;
        }
        displayreverse(head.next);
        System.out.print(head.data + " ");
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String args[]){
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(11);
        Node d = new Node(9);
        Node e = new Node(15);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node temp = a;

//        for(int i=0; i<=4; i++){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//
//        Node tem = a;
//        System.out.println();
//        while (tem!=null){
//            System.out.print(tem.data + " ");
//            tem = tem.next;
//        }
        Node head = a;
        displayrecursion(head);
        System.out.println();
        displayreverse(head);
        System.out.println();
        length(b);

//        LinkedList ll = new LinkedList();
//
//        ll.insertAtEnd(5);
//        ll.insertAtEnd(6);
//        disp();
    }
}
