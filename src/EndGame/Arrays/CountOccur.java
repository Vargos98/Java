package EndGame.Arrays;

import java.util.Scanner;

public class CountOccur {
    public static int Occur(int[] arr, int num){
        int count=0;
        int i =0;
        while(i<arr.length){
            if(arr[i]==num){
                count++;
            }
            i++;
        }
        return count;

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
        System.out.println("Please enter the num you want to count : ");
        int num = sc.nextInt();
        ;
        System.out.println("The Count for " +num+" is :"  +Occur(arr, num));
    }
}
