package JavaBasicPrograms.src.DSA.Arrays.OneDArr;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 34, 68, 72, 99, 100, 102, 11, 10, 9, 8, 18, 19, 22, 21, 300, 52, 51, 67, 69, 10};
        System.out.print("Enter start : ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        System.out.print("Enter Target value : ");
        int target = sc.nextInt();
        System.out.println(search(arr, start, end, target));
    }

    static int search(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                System.out.println("Found at : " +i);
                return 0;
            }

        }
        System.out.println("Not Found");
        return -1;
    }
}
