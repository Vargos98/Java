package DSA.Arrays.OneDArr;

import java.util.Scanner;

public class ThirdLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Check if the array size is valid
        if (n < 3) {
            System.out.println("Array must have at least 3 elements.");
            return;
        }

        int[] arr = new int[n];

        
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }

        System.out.println(third);
    }
}
