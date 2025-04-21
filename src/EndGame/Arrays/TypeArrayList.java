package EndGame.Arrays;

import java.util.ArrayList;

public class TypeArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(200);
        list.add(201);
        list.add(58);
        list.add(64);

//        list.toArray();
        // list.set(0,99) (index, value)
        
        System.out.println(list);

    }
}
