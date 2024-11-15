package DSA.Arrays.OneDArr;

import java.util.Scanner;

public class SumAndMean {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        float mean = 0;
        System.out.println("Enter numbers!");

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            count +=arr[i];
            mean = (float) count/n;
        }
        System.out.println("Sum :" + count);
        System.out.println("Average : "+mean);





    }
}
