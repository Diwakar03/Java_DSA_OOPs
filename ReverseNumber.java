import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            int r=num%10;
            sum=sum*10+r;
            num/=10;
        }
        System.out.print(sum);
    }
}
