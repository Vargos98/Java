package EndGame.Basics;

import java.util.Scanner;

public class ProductSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = sc.nextInt();
        sc.close();

        int sum = 0, product = 1;

        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            product *= lastDigit;
            n /= 10;
        }

        int result = product - sum;
        System.out.println("Product - Sum of digits: " + result);
    }
}
