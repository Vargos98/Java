package EndGame.Arrays;

import java.util.Scanner;

public class MaxInArr {

    // Function to find the maximum element in an array
    public static int MaxFinder(int[] nums) {
        int max = nums[0]; // Initialize 'max' with the first element

        // Iterate through the array using an enhanced for-loop
        for (int num : nums) {
            if (num > max) {
                max = num; // Update 'max' if a larger number is found
            }
        }
        return max; // Return the maximum value
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Please enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // ✅ Create a dynamic array of size 'n'

        // Taking array input from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display the maximum element in the array
        System.out.println("Max element in array: " + MaxFinder(arr));

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
