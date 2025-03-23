package BasicPrograms;

import java.util.Scanner;

public class CountOccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Input the digit to count
        System.out.print("Enter the digit to count: ");
        int d = sc.nextInt();
        sc.close();

        int count = 0;
        int temp = n;

        // Count occurrences of digit `d` in `n`
        while (temp > 0) {
            if (temp % 10 == d) {
                count++;
            }
            temp /= 10;
        }

        // Display result
        System.out.println("The digit " + d + " appears " + count + " times in " + n);
    }
}
