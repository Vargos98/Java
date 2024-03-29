package DSA.Arrays.OneDArr;

import java.util.Scanner;

public class MinAndMaxInArr {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int max;
        for(max = 0; max < n; ++max) {
            arr[max] = sc.nextInt();
        }

        max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Min value: " + min + "Max value: " + max);
    }
}
