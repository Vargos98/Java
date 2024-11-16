package DSA.Arrays.OneDArr;

import java.util.Arrays;

public class ReverseArrUsingTwoPointers {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6};

        int start = 0;
        int end = numbers.length-1;
        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(numbers));
    }

}
