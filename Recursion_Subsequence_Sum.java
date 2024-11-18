import java.util.ArrayList;
import java.util.List;

public class Recursion_Subsequence_Sum{

    // Method to print subsequences with a sum equal to target
    public static void printSubsequencesWithSum(int index, List<Integer> current, int arr[], int n, int target, int currentSum) {
        // Base case: if we have considered all elements
        if (index == n) {
            // Check if the current sum equals target and print the subsequence if it does
            if (currentSum == target) {
                System.out.println(current);
            }
            return;
        }

        // Pick the current element
        current.add(arr[index]);
        printSubsequencesWithSum(index + 1, current, arr, n, target, currentSum + arr[index]);

        // Backtrack and remove the current element
        current.remove(current.size() - 1);
        printSubsequencesWithSum(index + 1, current, arr, n, target, currentSum);
    }

    public static void main(String args[]) {
        int arr[] = {3, 1, 2};
        int target = 3; // Set your target sum here
        int n = arr.length;

        ArrayList<Integer> ls = new ArrayList<>();

        // Print subsequences with sum equal to target
        printSubsequencesWithSum(0, ls, arr, n, target, 0);
    }
}
