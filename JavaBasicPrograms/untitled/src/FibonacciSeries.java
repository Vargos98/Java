import java.util.Scanner;

public class FibonacciSeries {
    public FibonacciSeries() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Nth value of fibonacci series : ");
        int n = sc.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;

        while(count < n) {
            int temp = i;
            i += p;
            p = temp;
            ++count;
            System.out.println(i);
        }

    }
}
