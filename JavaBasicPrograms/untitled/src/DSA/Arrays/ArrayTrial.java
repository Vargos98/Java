package DSA.Arrays;

import java.util.Scanner;

public class ArrayTrial {
    public static void main(String[] args) {

        // create an array
        Scanner sc =  new Scanner(System.in);
        System.out.print("please enter the size of the array : ");
        int n = sc.nextInt();
        int[] age = new int[n];

        for(int i =0;i< n;i++){
            age[i] = sc.nextInt();
        }

        System.out.println("the entered elements are : ");
//        for(int i =0;i < n;i++){
//            System.out.print(age[i]+" ");
//        }

        /// for-each loop
        for(int i : age){
            System.out.print(i+" ");
        }
    }
}
