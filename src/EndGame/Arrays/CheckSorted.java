package EndGame.Arrays;

import java.util.Scanner;

public class CheckSorted {

    // Function to check if the given array is sorted in ascending order
    public static boolean SortCheck(int[] nums) {
        // Iterate through the array from the second element to the last
        for (int i = 1; i < nums.length; i++) {
            // If the previous element is greater than the current one, the array is not sorted
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }
        return true; // If no such case is found, the array is sorted
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Please enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n]; // ✅ Create an array of size 'n'

        // Taking array input from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Display whether the array is sorted or not
        System.out.println("Is the array sorted? " + SortCheck(nums));

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
