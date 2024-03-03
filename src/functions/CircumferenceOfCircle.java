package functions;

import java.util.Scanner;

public class CircumferenceOfCircle {
    public CircumferenceOfCircle() {
    }

    static double Circum(double r) {
        if (r > 0.0) {
            double pi = 3.14;
            double cirum = 2.0 * pi * r;
            return cirum;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle : ");
        double r = sc.nextDouble();
        System.out.println(Circum(r));
    }
}

