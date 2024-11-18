public class Recursion_sum {
    static int rec_sum(int a){
        if(a==0){
            return 0;
        }
        return a + rec_sum(a-1);
    }
    public static void main(String[] args){
        System.out.println(rec_sum(10));
    }
}
