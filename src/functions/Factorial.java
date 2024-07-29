package functions;

import java.util.Scanner;

public class Factorial {

    public static int findFactorial(int a ){
       int factorial = 1;

       for(int i=a;i>=1;i--){
           factorial = factorial * i;
       }
       return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number whose you want to find its factorial :");
        int a = sc.nextInt();
        System.out.println("Factorial of "+a+ " = " +findFactorial(a) );
    }
}
