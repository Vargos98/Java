package EndGame.Arrays;

import java.util.Scanner;

public class SecondLargest {

    public static int checkSecondLargest(int[] nums) {
        int largest = nums[0]; // Initialize the largest element with the first element of the array
        int secondLargest = nums[1]; // Initialize the second-largest element with the second element

        for (int i = 0; i < nums.length; i++) {
            // If the current element is greater than the largest, update secondLargest before updating largest
            if (nums[i] > largest) {
                secondLargest = largest; // The previous largest now becomes the second largest
                largest = nums[i]; // Update largest to the current element
            }
            // If the current element is not the largest but is greater than secondLargest, update secondLargest
            else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        return secondLargest; // Return the second largest element found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the values in Array ->");
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();

        }
        System.out.println(checkSecondLargest(nums));


    }
}
