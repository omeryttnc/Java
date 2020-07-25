package techproed2020.day38collectionsdt;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class try01 {
    public static void main(String[] args) {


        LinkedList<String> l1 = new LinkedList<>();
        l1.add("A");
        l1.addFirst("B");
        System.out.println(l1);
        l1.addFirst("C");
        System.out.println(l1);
        l1.addLast("D");
        System.out.println(l1);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        Collections.sort(l1);
        System.out.println(l1);
        System.out.println(l1.element());
        System.out.println(l1);

    }
}
