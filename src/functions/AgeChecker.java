package functions;

import java.util.Scanner;

public class AgeChecker {
    public AgeChecker() {
    }

    static boolean checkAge(int age) {
        if (age > 0) {
            return age > 18;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        int age = sc.nextInt();
        System.out.println(checkAge(age));
    }
}

