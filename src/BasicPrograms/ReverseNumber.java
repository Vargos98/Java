package BasicPrograms;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int num = sc.nextInt();
        int reversed = 0;
        System.out.println("Original Number: " + num);

        while(num != 0) {
            int LastDigit = num % 10;
            reversed = 10 * reversed + LastDigit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
