import java.util.Scanner;

public class FibonaciSeries {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("please enter the nth position you want to print: ");
        int n = in.nextInt();
        int a=0,b=1;
        int count =2;
        while(count <=n){
            int temp = b;
            b= b+a;
            a=temp;
            count++;
        }
        System.out.println(b);

    }
}
