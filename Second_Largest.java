public class Second_Largest {
    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1}; // Example array
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = array[i]; // Update largest
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i]; // Update second largest
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
