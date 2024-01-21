package JavaBasicPrograms.src.functions;

import java.util.Scanner;

public class SumOfOdd {
    static int PrintSum(int n){
        int oddCount = 0;
        for(int i =1;i<=n;i++){
            if(i%2 !=0){
                oddCount +=i;

            }
        }
        return oddCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the range : ");
        int n = sc.nextInt();
        System.out.println(PrintSum(n));
    }
}
