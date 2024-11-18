import java.util.*;
public class PW_Queue01 {
    public static void main(String args[]){
        Queue<Integer> q= (Queue<Integer>) new LinkedList();
        System.out.println(q.isEmpty());
        q.add(5);
        System.out.println(q.isEmpty());
        q.add(6);
        q.add(21);
        q.add(11);
        System.out.println(q);
        System.out.println("Size: " + q.size());
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.element());
        System.out.println("Size: " + q.size());


    }
}
