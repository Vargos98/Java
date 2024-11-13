package DSA.Arrays.TwoDArr;

import java.util.Scanner;

public class TwoDArray {


    public static void main(String[] args) {
        int twoD[][] = new int[5][5];
        int  k =0;

        for(int i =0; i<5;i++){
            for(int j = 0 ;j<5;j++)
            {
                twoD[i][j] = k;
                k++;
            }
        }

        for(int i =0; i<5;i++){
            for(int j = 0 ;j<5;j++)
            {
                System.out.print(twoD[i][j]+" ");

            }
            System.out.println();
        }



    }
}
