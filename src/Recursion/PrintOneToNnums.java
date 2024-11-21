package Recursion;

import java.util.Scanner;

public class PrintOneToNnums {
    static void printNums(int n) {
        if (n <= 0) {
            return;
        }

        // Recursive call first (to handle smaller numbers first)
        printNums(n - 1);

        // Print the current number after recursive calls
        System.out.print(n + " ");
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNums(n);
    }
}
