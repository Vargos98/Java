package DSA.Arrays.OneDArr;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // The array we want to reverse
        int numbers[] = {1, 2, 3, 4, 5, 6};

        // Find the length of the array
        int totalNumbers = numbers.length;

        // Create a new array to store the reversed result
        int reversed[] = new int[totalNumbers];

        // Fill the new array with numbers from the original array in reverse order
        for (int i = totalNumbers - 1; i >= 0; i--) {
            reversed[totalNumbers - i - 1] = numbers[i];
        }

        // Print the reversed array
        System.out.println(Arrays.toString(reversed));
    }
}
