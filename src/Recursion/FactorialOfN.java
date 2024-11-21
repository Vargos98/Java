package Recursion;

import java.util.Scanner;

public class FactorialOfN {
    static int factorial(int n) {
        if (n <= 0 || n == 1) { // Base case
            return 1;
        }

        // Recursive case: Multiply n by the factorial of (n - 1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: the number n
        int n = sc.nextInt();

        // Output: factorial of n
        System.out.println(factorial(n));
    }
}
