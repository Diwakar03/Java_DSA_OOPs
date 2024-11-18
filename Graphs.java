import java.util.*;
public class Graphs {
    static Vertex start, p, q;
    static Edge l, k;

    public static void main(String[] args) {
        create();
        bfs();
        dfs();
    }

    static void create() {
        int data, flag = 0;
        start = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nodes (0 to stop) : ");
        while (true) {
            data = sc.nextInt();
            if (data == 0)
                break;
            p = new Vertex();
            p.data = data;
            p.status = 0;
            p.next = null;
            p.adj = null;
            if (flag == 0) {
                start = p;
                q = p;
                flag++;
            } else {
                q.next = p;
                q = p;
            }
        }
        p = start;
        while (p != null) {
            System.out.printf("Enter links to" + p.data + "  : (0 to stop) :");
            flag = 0;
            while (true) {
                data = sc.nextInt();
                if (data == 0)
                    break;
                k = new Edge();
                k.adj = null;
                if (flag == 0) {
                    p.adj = k;
                    l = k;
                    flag++;
                } else {
                    l.adj = k;
                    l = k;
                }
                q = start;
                while (q != null) {
                    if (q.data == data) {
                        k.next = q;
                        break;
                    }
                    q = q.next;
                }
            }
            p = p.next;
        }
        sc.close();
    }

    static void bfs() {
        int[] queue = new int[20];
        int front = -1, rear = -1;
        p = start;
        while (p != null) {
            p.status = 0;
            p = p.next;
        }
        p = start;
        queue[++rear] = p.data;
        p.status = 1;
        while (true) {
            int node = queue[++front];
            if (node == 0)
                break;
            p = start;
            while (p != null) {
                if (p.data == node)
                    break;
                p = p.next;
            }
            k = p.adj;
            while (k != null) {
                q = k.next;
                if (q.status == 0) {
                    queue[++rear] = q.data;
                    q.status = 1;
                }
                k = k.adj;
            }
        }
        System.out.println("Breadth First Search Results");
        System.out.println("---------------------------");
        for (Vertex vertex = start; vertex != null; vertex = vertex.next) {
            System.out.print(vertex.data + "\t");
        }
        System.out.println();
    }

    static void dfs() {
        int[] stack = new int[25];
        int top = 1;
        System.out.println("Depth First Search Results");
        System.out.println("---------------------------");
        p = start;
        while (p != null) {
            p.status = 0;
            p = p.next;
        }
        p = start;
        stack[0] = 0;
        stack[top] = p.data;
        p.status = 1;
        while (true) {
            int node = stack[top--];
            if (node == 0)
                break;
            p = start;
            while (p != null) {
                if (p.data == node)
                    break;
                p = p.next;
            }
            System.out.print(node + "\t");
            k = p.adj;
            while (k != null) {
                q = k.next;
                if (q.status == 0) {
                    stack[++top] = q.data;
                    q.status = 1;
                }
                k = k.adj;
            }
        }
    }
}

class Vertex {
    int data, status;
    Vertex next;
    Edge adj;
}
class Edge {
    Vertex next;
    Edge adj;
}