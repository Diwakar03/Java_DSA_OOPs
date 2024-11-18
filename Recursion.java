public class Recursion {
    static int recp(int a, int sum){
        if(a==0){
            //System.out.println(sum);
            return sum;
        }
        return recp(a-1,sum+=a);
    }
    public static void main(String[] args){
        System.out.print(recp(5, 0));
    }
}
