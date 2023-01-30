package Array;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> k=new ArrayList<Integer>();
        k.add(15);k.add(24);k.add(06);
        System.out.println(k);
        System.out.println(k.isEmpty());
        k.remove(2);
        System.out.println(k);

    }
}
