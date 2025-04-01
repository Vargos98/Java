package EndGame.Arrays;

import java.util.Scanner;

public class ReverseString {
    public static String revStr(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your string");
        String str = sc.nextLine();
        System.out.println("Ypur entered string is : "+str);

        System.out.println("Now reversed string is : "+revStr(str));
    }
}
