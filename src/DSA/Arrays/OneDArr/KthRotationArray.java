package DSA.Arrays.OneDArr;

import java.util.Arrays;

public class KthRotationArray {
    public static void main(String[] args) {
        // The array we want to rotate
        int numbers[] = {1, 2, 3, 4, 5, 6};

        // Find out how many times we need to rotate
        int totalNumbers = numbers.length;
        int rotations = 3;

        // Prevent unnecessary extra rotations
        rotations = rotations % totalNumbers;

        // Rotate the array one step at a time
        while (rotations > 0) {
            // Remember the first number
            int firstNumber = numbers[0];

            // Shift all numbers one step to the left
            for (int i = 0; i < totalNumbers - 1; i++) {
                numbers[i] = numbers[i + 1];
            }

            // Move the first number to the end
            numbers[totalNumbers - 1] = firstNumber;

            // Decrease the number of rotations left
            rotations--;
        }

        // Print the rotated array
        System.out.println(Arrays.toString(numbers));
    }
}
