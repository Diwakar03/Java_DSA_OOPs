public class Recursion_reverse_array {
    public static void reverse(int[] arr, int index) {
        if (index >= arr.length / 2) {
            return;
        }

        int temp = arr[index];
        arr[index] = arr[arr.length - index - 1];
        arr[arr.length - index - 1] = temp;

        reverse(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        reverse(array, 0);

        System.out.println("\nReversed Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
