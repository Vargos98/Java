package EndGame.Basics;

import java.util.Scanner;

public class AmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ogNum = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while(n>0){
            int lstDigit = n%10;
            sum = (int) (sum+(Math.pow(lstDigit,digits)));
            n /=10;
        }
        if(sum == ogNum){
            System.out.println(ogNum+ " is an Amstrong number.");
        }else{
            System.out.println(ogNum+ " is not an Amstrong number");
        }
    }
}
