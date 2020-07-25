package techproed2020.day37iteratorscollectionsdt;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class try02 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(15);
        l1.add(16);
        l1.add(17);
        l1.add(18);
        l1.add(19);
        ListIterator<Integer> l2 = l1.listIterator();
        System.out.println(l1);
        while (l2.hasNext()) {
            Integer el = l2.next();
            l2.set(el + 5);
        }
        System.out.println(l1);

        List<String> st1 = new ArrayList<>();
        st1.add("Mahmut");
        st1.add("Hasan");
        st1.add("Huseyin");
        st1.add("Kasim");
        ListIterator<String> it1 = st1.listIterator();
        System.out.println(st1);
        while(it1.hasNext()){
            String et = it1.next();

            it1.set(et.replace(et.substring(et.length()-3) ,"***"));
        }
        System.out.println(st1);
    }
}
