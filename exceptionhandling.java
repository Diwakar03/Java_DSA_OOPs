import java.util.*;
public class exceptionhandling {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter nums: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x/y;
            System.out.println("Sum: " + z);
        }

//        catch (InputMismatchException e){
//            System.out.println("Exception invalid input");
//        }
//        catch (ArithmeticException e1){
//            System.out.println("Denominator is 0");
//        }
        catch (Exception e){
            System.out.println("Exception handled");
        }
    }
}
