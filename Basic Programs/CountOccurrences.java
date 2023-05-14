import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the number you want the count of : ");
        int c = sc.nextInt();
        int count =0;
        while(n>0)
        {
            int rem = n%10;
            if (rem == c){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
