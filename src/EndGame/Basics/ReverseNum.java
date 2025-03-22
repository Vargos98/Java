package EndGame.Basics;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            int lstDigit = n %10;
            rev = rev *10+lstDigit;
            n = n/10;
        }
        System.out.println(rev);

    }
}
