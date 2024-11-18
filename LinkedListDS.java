import java.util.Scanner;
public class LinkedListDS {
    static Node root = null;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1.Append");
            System.out.println("2.Display");
            System.out.println("3.Length");
            System.out.println("4.Add first");
            System.out.println("5.Add after");
            System.out.println("6.Search");
            System.out.println("7.Delete first");
            System.out.println("8.Delete After");
            System.out.println("9. Swapping");
            System.out.println("9.Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch==1){
                System.out.println("Enter element to add:");
                int ele = sc.nextInt();
                append(ele);
            }
            else if (ch==2){
                display();
            }
            else if (ch==3){
                int len = length();
                System.out.println("Length is " + length());
            }
            else if (ch==4){
                System.out.println("Enter element to add at first: ");
                int ele = sc.nextInt();
                addFirst(ele);
            }
            else if (ch==5){
                System.out.print("Enter loc: ");
                int loc = sc.nextInt();
                System.out.println("Enter ele to add after:");
                int ele = sc.nextInt();
                addAfter(loc,ele);
            }
            else if(ch==6){
                    System.out.println("Enter element: ");
                    int ele = sc.nextInt();
                    search(ele);
            }

            else if (ch==7){
                //System.out.println("Enter element to delete");
                //int loc = sc.nextInt();
                deleteFirst();
            }

            else if (ch==8){
                System.out.println("Enter elemnt to delete:");
                int loc = sc.nextInt();
                deleteAfter(loc);
            }
            else if (ch==9){
                System.out.println("Enter locations:");
                int loc1 = sc.nextInt();
                int loc2 = sc.nextInt();
                swapData(loc1,loc2);
            }

            else if (ch==10){
                System.out.println("End");
                break;
            }
            else {
                System.out.println("Invalid Choice");
            }

        }

    }
    static void append(int ele){
        Node temp = new Node();
        temp.data = ele;
        if (root==null){
            root = temp;
        }
        else{
            Node last = root;
            while (last.link != null){
                last = last.link;
            }
            last.link = temp;
        }
        System.out.println("Appended to list");
    }
    static void display(){
        if (root==null){
            System.out.println("List is empty");
        }
        else {
            System.out.println("List is : ");
            Node temp = root;
            while (temp!=null){
                System.out.println(temp.data);
                temp = temp.link;
            }
        }
    }
    static int length(){
        Node temp = root;
        int count = 0;
        while (temp!=null){
            count++;
            temp = temp.link;
        }
        return count;
    }
    static void addFirst(int ele){

        Node temp = new Node();
        temp.data = ele;
        temp.link = root;
        root = temp;
        System.out.println("Added first");
    }

    static void addAfter(int loc,int ele){
        int len = length();
        if (loc>0 && loc<=len){
            Node temp = new Node();
            temp.data = ele;

            int i = 1;
            Node target = root;
            while (i<loc){
                target = target.link;
                i++;
            }
            temp.link = target.link;
            target.link = temp;
            System.out.println("Added to list");

        }
        else {
            System.out.println("Error: Invalid loc, list has only " + len + "nodes");
        }
    }

    static void deleteFirst(){
        if(root==null){
            System.out.println("Empty");
        }

        else{
            Node temp = root;
            root = root.link;
            temp.link = null;
        }

    }


    static void search(int ele){
        Node temp = root;
        boolean found = false;
        while (temp!=null){
            if (temp.data==ele)
            {
                System.out.println("Found");
                found = true;
                break;
            }
            temp = temp.link;
        }
        if(!found){
            System.out.println("Not found");
        }
    }

    static void deleteAfter(int loc){
        int len = length();
        if(loc>=1 && loc<len){
            int i=1;
            Node p = root;
            while (i<loc){
                p=p.link;
                i++;
            }
            Node q = p.link;
            p.link = q.link;
            q.link = null;
        }
        else {
            System.out.println("Invalid loc given");
        }
    }

    static void swapData(int loc1, int loc2){
        int len = length();
        if (loc1>=1 && loc1<=len && loc2>=1 && loc2<=len){
            int i=1, j=1;
            Node p = root;
            Node q = root;
            while(i<loc1){
                p=p.link;
                i++;
            }
            while(j<loc2){
                q=q.link;
                j++;
            }
            int temp = p.data;
            p.data = q.data;
            q.data = temp;
            System.out.println("Data Swapped");
        }
    }
}
class Node
{
    int data;
    Node link;
}