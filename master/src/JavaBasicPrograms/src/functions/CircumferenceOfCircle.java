package JavaBasicPrograms.src.functions;

import java.util.Scanner;

public class CircumferenceOfCircle {
    static double Circum(double r ){
        while(r>0){
            double pi = 3.14;
            double cirum = 2*pi*r;
            return cirum;
        }
        return 0;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle : ");
        double r = sc.nextDouble();
        System.out.println(Circum(r));
    }
}
