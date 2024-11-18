public class Recursion_fac {
    static int findfac(int a,int b){
        if(a==1){
            return b;
        }
        return findfac(a-1, b * a);
    }
    static int findfac2(int c){
        if(c==0){
            return 1;
        }
        return c * findfac2(c-1);
    }
    public static void main(String[] args){
        //System.out.println(findfac(6,1));
        System.out.println(findfac2(7));
    }
}
