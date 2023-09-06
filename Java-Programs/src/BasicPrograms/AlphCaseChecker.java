package BasicPrograms;

import java.util.Scanner;

public class AlphCaseChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the string");
        char ch = sc.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }
    }
}
