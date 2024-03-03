package BasicPrograms;

import java.util.Scanner;

public class CountOccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the numbers : ");
        int n = sc.nextInt();
        int count = 0;
        System.out.print("Enter the number which you want to get the count for : ");

        for(int d = sc.nextInt(); n > 0; n /= 10) {
            int rem = n % 10;
            if (rem == d) {
                ++count;
            }
        }

        System.out.println("the provided count is : " + count);
    }
}
