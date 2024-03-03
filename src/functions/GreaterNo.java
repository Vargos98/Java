package functions;

import java.util.Scanner;

public class GreaterNo {

    static int Greatest(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Greatest(a, b));
    }
}
