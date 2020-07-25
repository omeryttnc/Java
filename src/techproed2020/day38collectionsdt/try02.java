package techproed2020.day38collectionsdt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class try02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("C");
        list.add("D");
        list.add("B");
        System.out.println(list);
        ListIterator<String> linkedList = list.listIterator();
        System.out.println(list);
        while (linkedList.hasNext()) {
            Object el = linkedList.next();
            linkedList.set(el + "X");
        }
        System.out.println(list);
while (linkedList.hasPrevious()){
    Object el = linkedList.previous();
        System.out.print(el + "L" +" ");
}
    }
}
