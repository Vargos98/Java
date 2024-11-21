package DSA.Arrays.OneDArr;

import java.util.Scanner;

public class SumAndMean {
    public static void main(String[] args) {
        //Write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0, mean=0;
        for(int  i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            sum +=arr[i];

            mean = sum/n;

        }

        System.out.println("Sum:"+ sum);
        System.out.println("Mean:"+ mean);

    }
}
