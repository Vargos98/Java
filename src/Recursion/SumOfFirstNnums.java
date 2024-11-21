package Recursion;

import java.util.Scanner;

public class SumOfFirstNnums {
    static void sumOfCounts(int n, int count) {
        if (n <= 0) {
            System.out.println(count); // Print the final count when n reaches 0
            return;
        }

        count += n;
        sumOfCounts(n - 1, count); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number n
        int n = sc.nextInt();
        int count = 0;

        // Call the recursive function
        sumOfCounts(n, count);
    }
}
