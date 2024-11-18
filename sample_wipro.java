import java.io.*;
import java.util.*;

class SampleWipro {

    // Function to get smallest digit of a number
    private int getSmallestDigit(int num) {
        int smallest = 9;
        while (num > 0) {
            int digit = num % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            num /= 10;
        }
        return smallest;
    }

    // Function to get largest digit of a number
    private int getLargestDigit(int num) {
        int largest = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit > largest) {
                largest = digit;
            }
            num /= 10;
        }
        return largest;
    }

    public int findKey(int input1, int input2, int input3) {
        // Calculate sum of smallest digits
        int sumSmallestDigits = getSmallestDigit(input1) + getSmallestDigit(input2) + getSmallestDigit(input3);

        // Calculate sum of largest digits
        int sumLargestDigits = getLargestDigit(input1) + getLargestDigit(input2) + getLargestDigit(input3);

        // Adjust the formula based on the expected result
        // This is a guess based on provided results; adjust the formula as needed
        int key = sumLargestDigits - sumSmallestDigits;

        return key;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of SampleWipro
        SampleWipro sampleWipro = new SampleWipro();

        // Prompt user for input
        System.out.print("Enter the first integer (input1): ");
        int input1 = scanner.nextInt();
        System.out.print("Enter the second integer (input2): ");
        int input2 = scanner.nextInt();
        System.out.print("Enter the third integer (input3): ");
        int input3 = scanner.nextInt();

        // Call the findKey method and print the result
        int key = sampleWipro.findKey(input1, input2, input3);
        System.out.println("The calculated key is: " + key);

        scanner.close();
    }
}
