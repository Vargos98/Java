package Recursion;

import java.util.Scanner;

public class PrintOneToNnums {
    static void printNums(int n){
        if(n<=0){
            return;
        }
        System.out.print(n+" ");
        printNums(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNums(n);
    }
}
