package EndGame.Arrays;

import java.util.Scanner;

public class ReverseString {

    // Function to reverse a string using StringBuilder
    public static String revStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Please enter your string:");
        String str = sc.nextLine();

        // Display the original string
        System.out.println("Your entered string is: " + str);

        // Call revStr() function and display the reversed string
        System.out.println("Now reversed string is: " + revStr(str));

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
