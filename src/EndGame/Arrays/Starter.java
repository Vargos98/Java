package EndGame.Arrays;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int n = sc.nextInt();
        for(int i =0;i<n;i++)
        {
            arr[i]= sc.nextInt();

        }
        System.out.println("The entered array items is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
