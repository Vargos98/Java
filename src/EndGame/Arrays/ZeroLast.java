package EndGame.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroLast {
    public static int[] MoveZero(int[] arr) {
        int left = 0; // Pointer to track the position of the next non-zero element
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            // If the current element is non-zero, swap it with the element at 'left' index
            if (arr[i] != 0) {
                temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;

                left++; // Move 'left' pointer forward to track the next non-zero position
            }
        }

        return arr; // Return the modified array with zeros moved to the end
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
        System.out.println(Arrays.toString(MoveZero(nums)));
    }
}
