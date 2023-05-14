import java.util.Scanner;

public class SwitchCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the two digits : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Please enter the operation that you want to perform \"+ - / * \" ");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
            default:
                System.out.println("You have entered the wrong operator");
                break;
        }
    }
}
