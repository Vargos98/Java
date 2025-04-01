package EndGame.Arrays;

import java.util.Scanner;

public class CheckSorted {
    public static boolean SortCheck(int[] nums){

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n]; // ✅ Dynamic array based on input size

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("The result is : "+SortCheck(nums));
    }
}
