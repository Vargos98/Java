package basicPrograms;

import java.util.Scanner;

public class SumOfnNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number greater than 0 : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1i<=n;i++){
            sum = sum + i;
        }
        System.out.println("The sum of N natural number is : " sum);
    }

}
