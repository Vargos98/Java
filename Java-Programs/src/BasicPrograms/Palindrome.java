package BasicPrograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int n = sc.nextInt();
        int rem,sum=0,temp;
        temp=n;
        while(n>0){
            rem=n%10;  //getting remainder
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
