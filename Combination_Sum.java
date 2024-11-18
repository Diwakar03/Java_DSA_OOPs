import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Combination_Sum {

    // Helper function to find sums of combinations that add up to the target
    private void findCombinationSums(int ind, int[] arr, int target, Set<Integer> result, int currentSum) {
        // Base case: if the target is met, add the sum to the result
        if (target == 0) {
            result.add(currentSum);
            return;
        }

        // If index goes out of bounds or target becomes negative, backtrack
        if (ind == arr.length || target < 0) {
            return;
        }

        // Pick the element at index 'ind'
        if (arr[ind] <= target) {
            findCombinationSums(ind, arr, target - arr[ind], result, currentSum + arr[ind]);
        }

        // Skip the element at index 'ind' and move to the next
        findCombinationSums(ind + 1, arr, target, result, currentSum);
    }

    // Function to return all unique sums of combinations that sum up to the target
    public List<Integer> combinationSumSums(int[] candidates, int target) {
        Set<Integer> resultSet = new HashSet<>();
        findCombinationSums(0, candidates, target, resultSet, 0);
        return new ArrayList<>(resultSet);  // Convert the set to a list for output
    }

    // Driver code
    public static void main(String[] args) {
        Combination_Sum solution = new Combination_Sum();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<Integer> result = solution.combinationSumSums(candidates, target);

        System.out.println("Unique sums of combinations that sum up to " + target + ": " + result);
    }
}
