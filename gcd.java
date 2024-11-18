public class gcd {
    // Method to calculate GCD using the Euclidean algorithm
    static int igcd(int a, int b) {
        while (a%b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return b; // Return the GCD
    }

    // Method to calculate LCM using GCD
    static int ilcm(int a, int b) {

        return Math.abs(a * b) / igcd(a, b); // Return the LCM
    }

    public static void main(String[] args) {
        int num1 = 8; // Example number 1
        int num2 = 12; // Example number 2

        int gcd = igcd(num1, num2); // Calculate GCD
        int lcm = ilcm(num1, num2); // Calculate LCM

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
