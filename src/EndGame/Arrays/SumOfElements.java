package EndGame.Arrays;

import java.util.Scanner;

public class SumOfElements {
    public static int sumOfElems(int[] nums) {
        int sum = 0;
        for (int num : nums) { // Using enhanced for-loop for better readability
            sum += num;
        }
        return sum;
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

        System.out.println("Sum of elements: " + sumOfElems(arr));
    }
}
