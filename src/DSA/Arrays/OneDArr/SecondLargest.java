package DSA.Arrays.OneDArr;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Initialize first and second largest with the minimum possible value
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        // Loop through input and update first and second largest
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                second = arr[i];
            }
        }

        System.out.println("Second largest element: " + second);
    }
}
