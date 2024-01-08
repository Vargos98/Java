package JavaBasicPrograms.src.basicPrograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int num = sc.nextInt();
        int reversed = 0;

        System.out.println("Original Number: " + num);

        // run loop until num becomes 0
        while(num != 0) {

            // get last digit from num
           int LastDigit = num%10;
           reversed = 10*reversed +LastDigit;
           num = num/10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
