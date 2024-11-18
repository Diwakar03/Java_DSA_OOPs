public class Recursion_fibo_num {
    static int fn(int n){
        if(n==1 || n==0){
            return n;
        }
        int last = fn(n-1);
        int slast = fn(n-2);

        return last + slast;
    }
    public static void main(String[] args){
        int n = 4;
        System.out.println(fn(n));
    }
}
