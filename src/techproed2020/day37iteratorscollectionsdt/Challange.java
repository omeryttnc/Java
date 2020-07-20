package techproed2020.day37iteratorscollectionsdt;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Challange {
    public static void main(String[] args) {
        List <String>list2 = new ArrayList<>();

        list2.add("Automation");
        list2.add("Testing");
        list2.add("Database");
        list2.add("Restful");
        System.out.println(list2);
        ListIterator<String > slit  = list2.listIterator();

        while (slit.hasNext()){
            String  el = slit.next();
            slit.set(el.replace(el.substring(el.length()-3),"***"));
        }
        System.out.println(list2);
    }
}
