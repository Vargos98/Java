package DSA.Arrays.OneDArr;

import java.util.Scanner;

public class SearchInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{12, 34, 68, 72, 99, 100, 102, 11, 10, 9, 8, 18, 19, 22, 21, 300, 52, 51, 67, 69, 10};
        System.out.print("Enter start : ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        System.out.print("Enter Target value : ");
        int target = sc.nextInt();
        System.out.println(search(arr, start, end, target));
    }

    static int search(int arr[], int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        } else {
            for (int i = start; i <= end; ++i) {
                if (arr[i] == target) {
                    System.out.println("Found at index: " + i);
                    return i;  // Return the index where the target was found
                }
            }

            System.out.println("Not Found");
            return -1;  // Return -1 if target is not found in the range
        }
    }
}
