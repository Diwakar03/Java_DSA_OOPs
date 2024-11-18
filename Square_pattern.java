public class Square_pattern {
    public static void print1star(){
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print2star(){
        for (int i=1; i<5; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print3(){
        for (int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void print4(){
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void print5() {
        for (int i = 5; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        print1star();
        print2star();
        print3();
        print4();
        print5();
    }
}
