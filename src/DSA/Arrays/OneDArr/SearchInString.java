package DSA.Arrays.OneDArr;

public class SearchInString {


    public static void main(String[] args) {
        String name = "Uuuuuuumeeeeshhhhhhhh samir tiwadi";
        char target = 'w';
        System.out.println(search(name, target));
    }

    static boolean search(String str, char target) {
        if (str.isEmpty()) {
            return false;
        } else {
            for(int i = 0; i < str.length(); ++i) {
                if (target == str.charAt(i)) {
                    return true;
                }
            }

            return false;
        }
    }
}
