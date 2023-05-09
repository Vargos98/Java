package arrays;

import java.util.Scanner;

public class OneDarray {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
                int [] cars = new int[100];
                System.out.println("Please enter the size of the array:");
                int n = sc.nextInt();
                System.out.println("Please enter elements in the array :");
                for(int i=0;i<n;i++)
                {
                    cars[i]=sc.nextInt();
                }
                System.out.println("The entered elements are :");
                for(int i=0;i<n;i++)
                {
                    System.out.println(cars[i]);
                }

     }
}
