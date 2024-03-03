package patterns;

public class patternFive {

    public static void main(String[] args) {
        int n = 5;
//        int m = true;

        for(int i = 1; i <= n; ++i) {
            int j;
            for(j = 1; j <= n - i; ++j) {
                System.out.print("   ");
            }

            for(j = 1; j <= i; ++j) {
                System.out.print(" x ");
            }

            System.out.println();
        }

    }
}
