import java.util.Scanner;

public class Acc_next_greater_ele {

    public static int[] printele(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int max = -1;
        for (int i = n - 1; i >= 0; i--) {
            int currentElement = arr[i];

            ans[i] = max;

            if (currentElement > max) {
                max = currentElement;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();  // Input the size of the array
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Input array elements
        }

        // Call the function to find the next greater elements
        int[] ans = printele(arr);

        System.out.println("Next greater elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
