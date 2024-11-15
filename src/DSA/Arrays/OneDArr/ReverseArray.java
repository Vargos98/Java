package DSA.Arrays.OneDArr;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        int n = arr.length;
        int temp[] = new int[n];
        for(int i = n-1;i>=0;){
            temp[n-i-1] = arr[i--];
        }
        System.out.println(Arrays.toString(temp));
    }
}
