package youtube2.c11;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> l3 = new ArrayList<String>();
        l3.add("omer");
        l3.add("Mahmut");
        System.out.println(l3);
        System.out.println();
        for (String s : l3
        ) {
            System.out.print(s + " ");

        }
        System.out.println();

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(5);
        l2.add(6532);
        System.out.println(l2);
        System.out.println();
        for (int i:l2
             ) {
            System.out.print(i+ " ");

        }
    }
}
