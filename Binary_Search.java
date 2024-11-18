public class Binary_Search {
    // Binary search method
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            // Check if target is at middle
            if (array[middle] == target) {
                return middle; // Target found
            }

            // If target is greater, ignore the left half
            if (array[middle] < target) {
                left = middle + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = middle - 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91};
        int target = 23;
        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
