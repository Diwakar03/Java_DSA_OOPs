import java.util.Scanner;

public class PW_recur_01 {
    static void printNat(int i){
        if (i==1){
            System.out.println(1);
            return;
        }
        System.out.println(i);
        printNat(i-1);

    }
    static void printNatRev(int i){
        System.out.println("In reverse" );
        if (i==1){
            System.out.println(1);
            return;
        }
        System.out.println(i);
        printNat(i-1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        printNatRev(n);
        printNat(n);

    }
}
