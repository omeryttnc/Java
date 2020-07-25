package techproed2020.day37iteratorscollectionsdt;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class try01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);
        for (int w:list
             ) { w = w+5;

        }


        Iterator <Integer> it = list.iterator();
        while (it.hasNext()){
         Object el =   it.next();
            it.remove();
        }
        System.out.println(list);
        ListIterator<Integer> lit = list1.listIterator();
        while(lit.hasNext()){
            Integer el = lit.next();
            lit.set(el + 5);
        }
            System.out.println(list1);
    }
}
