package Recursion;

import java.util.Scanner;

public class PrintNameNTimes {
    static void printName(int n, String str) {
        // Base case: stop recursion when n becomes 0
        if (n <= 0) {
            return;
        }

        // Print the name
        System.out.println(str);

        // Recursive call with n decremented
        printName(n - 1, str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of times to print and the string
        int n = sc.nextInt();
        String str = sc.next();

        // Call the recursive function
        printName(n, str);
    }
}
