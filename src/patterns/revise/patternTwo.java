package patterns.revise;

public class patternTwo {
    public static void main(String[] args) {
        int n=4;

       for(int i = 1; i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print(" * ");
           }
           System.out.println();
       }
        System.out.println();

        for(int i = 1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" " + i);

            }
            System.out.println();
        }
        System.out.println();
        char ch = 'A';
        for(int i = 1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" " +ch);
                ch++;
            }

            System.out.println();
        }
        System.out.println();
        char character = 'A';
        for(int i = 1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" " +character);

            }
            character++;
            System.out.println();
        }
    }
}
// *
// * *
// * * *
// * * * *