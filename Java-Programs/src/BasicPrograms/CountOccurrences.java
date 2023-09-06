package BasicPrograms;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number :");
        int n = sc.nextInt();
        System.out.print("please enter the number you want the count occurrences of : ");
        int v = sc.nextInt();
        int count =0;
        while(n>0)
        {
            int rem = n%10;
            if(rem == v)
            {
                count++;
            }n=n/10;
        }
        System.out.println(count);
    }
}
