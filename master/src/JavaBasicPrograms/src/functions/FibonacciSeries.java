package JavaBasicPrograms.src.functions;

import java.util.Scanner;

public class FibonacciSeries {
    static void FibonacciSeries(int n) {

        int count = 2;
        int a = 0;
        int i =1;

        System.out.print(a+" ");
        System.out.print(i+" ");
        while(count < n) {
            int temp = i;
            i += a;
            a = temp;
            ++count;
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Nth value of fibonacci series : ");
        int n = sc.nextInt();
        FibonacciSeries(n);


    }
}
