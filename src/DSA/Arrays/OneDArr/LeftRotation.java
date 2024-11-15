package DSA.Arrays.OneDArr;

import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int temp = arr[0];
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
