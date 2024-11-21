package DSA.Arrays.OneDArr;

import java.util.Scanner;

public class GreatestInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the size of the array
        int arr[] = new int[n];

        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible value
        int maxIndex = -1; // Variable to track the index of the greatest element

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read array elements
            if (arr[i] > max) { // Update max if the current element is greater
                max = arr[i];
                maxIndex = i; // Update the index of the max element
            }
        }

        System.out.println("Max element = " + max + " found at index " + maxIndex);


    }
}
