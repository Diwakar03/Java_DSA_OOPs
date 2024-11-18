public class rec_2p {
    public static void rev_arr2p(int[] arr, int i, int n) {
        if (i >= arr.length / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        rev_arr2p(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 7};
        int n = arr.length;

        // Print the original array
        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Reverse the array using the recursive function
        rev_arr2p(arr, 0, n);

        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
