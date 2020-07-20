package techproed2020.day37iteratorscollectionsdt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class I01 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(21);
        list.add(22);
        list.add(23);
        System.out.println(list);

        for (int w:list
             ) {w = w+5;

        }

        Iterator <Integer> it = list.iterator();
        while (it.hasNext()){

           Object el = it.next();
           it.remove();

        }
    }
}
