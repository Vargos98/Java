package DSA.Arrays.OneDArr;
import java.util.Scanner;
public class InputOutput {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] names = new String[size];
// for inputting the entered names
        int i;
        for(i = 0; i < size; ++i) {
            names[i] = sc.next();
        }
//        For printing the entered names
        for(i = 0; i < size; ++i) {
            System.out.println(names[i]);
        }

    }
}
