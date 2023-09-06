package BasicPrograms;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number :");
        int n = sc.nextInt();
        int ans =0;

        while(n>0){
            int rem = n%10; //to get last digit
            n=n/10; // to shorten the entered digit
            ans = (ans * 10) +rem;
        }
        System.out.print("The reversed Num : " + ans);
    }
}
