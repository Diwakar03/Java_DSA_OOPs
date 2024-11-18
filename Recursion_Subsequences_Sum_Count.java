import java.util.ArrayList;

public class Recursion_Subsequences_Sum_Count {

    // Method to count subsequences with a sum equal to target
    public static int countSubsequencesWithSum(int index, int arr[], int n, int target, int currentSum) {
        // Base case: if we have considered all elements
        if (index == n) {
            // Check if the current sum equals the target
            return currentSum == target ? 1 : 0;
        }

        // Count subsequences including the current element
        int includeCount = countSubsequencesWithSum(index + 1, arr, n, target, currentSum + arr[index]);

        // Count subsequences excluding the current element
        int excludeCount = countSubsequencesWithSum(index + 1, arr, n, target, currentSum);

        return includeCount + excludeCount;
    }

    public static void main(String args[]) {
        int arr[] = {3, 1, 2};
        int target = 3; // Set your target sum here
        int n = arr.length;

        // Count subsequences with sum equal to target
        int count = countSubsequencesWithSum(0, arr, n, target, 0);
        System.out.println("Number of subsequences with sum " + target + ": " + count);
    }
}
