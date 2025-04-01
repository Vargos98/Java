package EndGame.Arrays;

import java.util.Scanner;

public class MaxInArr {

    public static int MaxFinder(int[] nums){
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Corrected: Dynamic array based on input size

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Max element in array: " + MaxFinder(arr));
    }
}
