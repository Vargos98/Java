package DSA.Arrays.OneDArr;

import java.util.Scanner;

public class LinearSearch {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number you want to search : ");
        int n = sc.nextInt();
        int[] arr = new int[]{12, 13, 98, 67, 72, 100};

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] == n) {
                System.out.println("Element found at index : " + i);
                return;
            }
        }

        System.out.println("element not found");
    }
}
