import java.util.ArrayList;
import java.util.List;

public class Recursion_Subsequences {

    // Method to print all subsequences
    public static void printsq(int index, List<Integer> current, int arr[], int n) {
        // Base case: if we have considered all elements
        if (index == n) {
            // Print the current subsequence
            System.out.println(current);
            return;
        }

        // Pick the current element
        current.add(arr[index]);
        printsq(index + 1, current, arr, n);

        // Backtrack and remove the current element
        current.remove(current.size() - 1);
        printsq(index + 1, current, arr, n);
    }

    public static void main(String args[]) {
        int arr[] = {3, 1, 2};
        int n = arr.length;
        ArrayList<Integer> ls = new ArrayList<>();

        // Print all subsequences
        printsq(0, ls, arr, n);
    }
}
