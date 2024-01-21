package JavaBasicPrograms.src.functions;

import java.util.Scanner;

public class AgeChecker {
    static boolean checkAge(int age){
        while(age>0)
        {
            if(age>18){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        int age = sc.nextInt();
        System.out.println(checkAge(age));
    }
}
