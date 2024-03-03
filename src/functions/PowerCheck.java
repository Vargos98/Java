package functions;

import java.util.Scanner;

public class PowerCheck {


    static void power(int n, int x) {
        long result;
        for(result = 1L; x != 0; --x) {
            result *= (long)n;
        }

        System.out.println("Answer = " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the 2 nos. : ");
        int n = sc.nextInt();
        int x = sc.nextInt();
        power(n, x);
    }
}

