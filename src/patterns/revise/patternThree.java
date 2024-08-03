package patterns.revise;

public class patternThree {
    public static void main(String[] args) {
        int m=5, n=5;
        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= m; ++j) {
                if (i != 1 && j != 1 && i != n && j != m) {
                    System.out.print("   ");
                } else {
                    System.out.print(" x ");
                }
            }
            System.out.println();
        }
    }
}
