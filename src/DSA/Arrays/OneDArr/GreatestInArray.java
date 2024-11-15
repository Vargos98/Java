package DSA.Arrays.OneDArr;

import java.util.Scanner;

public class GreatestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");


        int big = 0; // Start with the first element as the greatest

        for (int i = 0; i < arr.length; i++) { // Start from index 1
            arr[i] = sc.nextInt();
            if (arr[i] > arr[big]) {
                big = i;
            }
        }

        System.out.println("Greatest = " + arr[big] + " Found at index = " + big);
        sc.close(); // Close scanner to avoid resource leaks
    }
}
