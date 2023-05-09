public class Pattern1 {
    public static void main(String[] args) {
        // to print upward facing star pattern
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
