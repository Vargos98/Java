package patterns;

public class patternFour {


    public static void main(String[] args) {
        int n = 5;
//        int m = true;

        for(int i = n; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(" x ");
            }

            System.out.println();
        }

    }
}

