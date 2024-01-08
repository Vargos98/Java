package JavaBasicPrograms.src.patterns;

public class patternNum {
    public static void main(String[] args) {
        int n =5,m=5;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
