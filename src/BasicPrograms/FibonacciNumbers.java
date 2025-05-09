package BasicPrograms;
import java.util.Scanner;
public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close(); // Close scanner to prevent resource leaks

        int a = 0, b = 1;

        System.out.print(a + " " + b + " "); // Print first two numbers

        for (int i = 2; i < n; i++) { // Start loop from index 2
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }

    }
}
