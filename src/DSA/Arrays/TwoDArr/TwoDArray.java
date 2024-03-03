package DSA.Arrays.TwoDArr;

import java.util.Scanner;

public class TwoDArray {


    public static void main(String[] args) {
        System.out.print("Enter 2D array size : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        System.out.println("Enter array elements : ");
        int[][] twoD = new int[rows][columns];

        int j;
        for(int i = 0; i < rows; ++i) {
            for(j = 0; j < columns; ++j) {
                twoD[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nData you entered : \n");
        int[][] var13 = twoD;
        j = twoD.length;

        for(int var7 = 0; var7 < j; ++var7) {
            int[] x = var13[var7];
            int[] var9 = x;
            int var10 = x.length;

            for(int var11 = 0; var11 < var10; ++var11) {
                int y = var9[var11];
                System.out.print("" + y + "  ");
            }

            System.out.println();
        }

    }
}
