package EndGame.Arrays;

import java.util.Scanner;

public class CountOccur {

    // Function to count the occurrences of a given number in the array
    public static int Occur(int[] arr, int num) {
        int count = 0; // Counter for occurrences

        int i = 0;
        while (i < arr.length) {
            // If the current element matches the target number, increment the counter
            if (arr[i] == num) {
                count++;
            }
            i++; // Move to the next element
        }
        return count; // Return the total count
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Please enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // ✅ Create an array of size 'n'

        // Taking array input from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Ask user for the number they want to count occurrences of
        System.out.print("Please enter the number you want to count: ");
        int num = sc.nextInt();

        // Display the count of the given number
        System.out.println("The count for " + num + " is: " + Occur(arr, num));

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
