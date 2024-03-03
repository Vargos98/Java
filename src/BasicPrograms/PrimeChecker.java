package BasicPrograms;

import java.util.Scanner;
public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number : ");
        int n = sc.nextInt();
        int c = 2;
        if (c <= n * n) {
            if (n % c == 0) {
                System.out.println("Not prime");
            } else {
                System.out.println("Prime");
            }
        } else {
            ++c;
        }
    }
}
