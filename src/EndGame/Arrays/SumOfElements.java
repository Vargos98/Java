package EndGame.Arrays;

import java.util.Scanner;

public class SumOfElements {

    // Function to calculate the sum of all elements in the array
    public static int sumOfElems(int[] nums) {
        int sum = 0;
        for (int num : nums) { // Using enhanced for-loop for better readability
            sum += num; // Accumulate sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for array size
        System.out.print("Please enter the size of the array: ");
        int n = sc.nextInt();

        // Initialize the array with user-defined size
        int[] arr = new int[n];

        // Taking input for array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display the sum of all elements
        System.out.println("Sum of elements: " + sumOfElems(arr));

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
