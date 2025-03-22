package EndGame.Basics;

import java.util.Scanner;

public class CommissionPercentageCalc {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double TotalSales = sc.nextDouble();
        double comissionAmt = sc.nextDouble();
        double comission = (comissionAmt/TotalSales) * 100;
        System.out.println(comission);

    }
}
