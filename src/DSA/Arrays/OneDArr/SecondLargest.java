package DSA.Arrays.OneDArr;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        int first = Math.max(arr[0], arr[1]);
        int second = Math.min(arr[0], arr[1]);
        for(int i=0 ;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();

            if(arr[i]>first)
            {
                second = first;
                first= arr[i];
            }else if(arr[i]>second)
            {
                second = arr[i];
            }

        }


        System.out.println("Second largest element : "+second);
    }
}
