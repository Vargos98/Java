package EndGame.Basics;

import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        int numCheck = sc.nextInt();
        while(temp>0){
            if(temp %10 == numCheck){
                count++;
            }
            temp /=10;


        }
        System.out.println("Number of occurrences are : "+count);
    }
}
