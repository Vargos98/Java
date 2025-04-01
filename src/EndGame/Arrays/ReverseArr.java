package EndGame.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArr {
    public static void Rev(int[] nums) {
        int left = 0;
        int right = nums.length - 1; // ✅ Fix: Initialize 'right' as the last index

        while (left < right) {
            // Swap elements
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            // Move pointers
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // ✅ Dynamic array based on input size

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Rev(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr)); // ✅ Fix: Use Arrays.toString()
    }
}
