package functions;

import java.util.Scanner;

public class AverageOfThree {
    public AverageOfThree() {
    }

    static int Average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Average(a, b, c));
    }
}
