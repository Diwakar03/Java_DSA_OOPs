public class Hard_Patterns {
    public static void print1(){
        for(int i=5; i>=1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void print2(){
        for(int i=5; i>=1; i--){
            for(int j = 5; j >= 6-i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void print3(){
        for (int i = 0; i<5; i++){
            for (int k = 0; k<5-i-1; k++){
                System.out.print(" ");
            }
            for (int j = 0; j<2*i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void print4() {
        for (int i = 0; i < 5; i++) { // Outer loop controls rows
            for (int j = 0; j < i; j++) { // Inner loop for spaces on the left
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * (5 - i) - 1); k++) { // Inner loop for stars
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void print5(){
        int a = 0;
        for(int i = 0; i<5; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(a%2);
                a++;

            }
            System.out.println();
        }
    }
    public static void print6() {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                    // Print 1 if position is odd, otherwise 0
                System.out.print(j % 2 == 1 ? "1" : "0");
            }
                // Print the row number at the end
            System.out.println(i);
        }
    }
    public static void print7(){
        for (int i = 1; i<=5; i++){
            for(char ch = 'A'; ch<='A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void print8(){
        System.out.println();
        for (int i = 0; i<=6; i++){
            for(char ch = 'A'; ch <='A' + 6 - i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void print9(){
        for (int i = 0; i<6; i++){
            char ch = 'A';

            for (int j = 0; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        print1();
        print2();
        print3();
        print4();
        print5();
        print6();
        print7();
        print8();
        print9();
    }
}
