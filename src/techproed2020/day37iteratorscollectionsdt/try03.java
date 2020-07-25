package techproed2020.day37iteratorscollectionsdt;

import java.util.LinkedList;
import java.util.List;

public class try03 {
    public static void main(String[] args) {
        List<String> llist = new LinkedList<>();
        llist.add("Steve");
        llist.add("Carl");
        llist.add("Raj");
        llist.add("Megan");
        llist.add("Ali");
        System.out.println(llist);

        llist.add(2,"XXX");
        System.out.println(llist);

        llist.remove(2);
        System.out.println(llist);
        llist.remove("Ali");
        System.out.println(llist );
    }
}
