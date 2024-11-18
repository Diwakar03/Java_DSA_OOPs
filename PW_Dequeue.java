import java.util.Deque;
import java.util.LinkedList;

public class PW_Dequeue {
    public static void main(String[] args){
        Deque<Integer> dq = new LinkedList<>();

        dq.addFirst(1);
        dq.addFirst(3);
        dq.addFirst(5);
        System.out.println(dq);

        dq.addLast(7);
        System.out.println(dq);
        dq.addLast(11);
        dq.addLast(13);
        System.out.println(dq);

        System.out.println("Removing elements");

        dq.removeFirst();
        System.out.println(dq);

        dq.removeLast();
        System.out.println(dq);

        dq.removeLast();
        System.out.println(dq);

        dq.removeFirst();
        System.out.println(dq);

        dq.remove(11);
        System.out.println(dq);

        dq.removeFirstOccurrence(3);
        dq.removeLastOccurrence(1);
        System.out.println(dq);

        //dq.removeAll(dq);
    }
}
