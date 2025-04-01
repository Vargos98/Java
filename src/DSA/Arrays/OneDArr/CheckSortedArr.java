package DSA.Arrays.OneDArr;

import java.util.Scanner;
public class CheckSortedArr {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of Arr : ");
        int n = sc.nextInt();
        System.out.println("Please enter arr elements");
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        boolean isAsc = true;

        for(int i = 0; i < arr.length - 1; ++i) {
            if (arr[i] > arr[i + 1]) {
                isAsc = false;
            }
        }

        if (isAsc) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }

    }
}
