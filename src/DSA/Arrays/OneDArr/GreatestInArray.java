package DSA.Arrays.OneDArr;

import java.util.Scanner;

public class GreatestInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the size of the array
        int arr[] = new int[n];

        int max=0; // Initialize max to the smallest possible value

        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt(); // Read array elements
            if (arr[i] > arr[max]) { // Update max if the current element is greater
                max = i;
                 // Update the index of the max element
            }
        }

        System.out.println("Max element = " + arr[max] + " found at index " + max);


    }
}
