package EndGame.Arrays;

import java.util.Scanner;

public class SecondLargest {

    public static int checkSecondLargest(int[] nums){
        int largest=nums[0];
        int secondLargest = nums[1];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]> largest)
            {

                secondLargest = largest;
                largest = nums[i];
            }else if(nums[i]>secondLargest)
            {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
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
