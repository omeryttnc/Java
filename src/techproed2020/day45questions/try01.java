package techproed2020.day45questions;

import java.util.*;
import java.util.stream.Collectors;

public class try01 {
    public static void main(String[] args) {
        String[] list = {"A", "B", "D", "C", "B", "A", "A", "B", "B"};
        Set<String> set1 = new HashSet<>();
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].equals(list[j])) {
                    set1.add(list[i]);
                }
            }
        }
        System.out.println(set1);
        Set<String> set2 = new HashSet< >();
        Set<String> set3 = new HashSet<>();

        for (String w: list
             ) { if(!set2.add(w)){
                 set3.add(w);
        }

        }
        System.out.println(set3);
Map<String ,Integer> map = new HashMap<>();
        for (String w:list
             ) {int count =1;
             if(!map.containsKey(w)){
            map.put(w,count);}
        else{
            map.put(w,map.get(w)+1);
             }

        }
        System.out.println(map);

        List<String> list1 = Arrays.asList(list);
        list1.stream()
                .filter(t->Collections.frequency(list1,t)>1)
                .collect(Collectors.toSet())
                .forEach(t-> System.out.print(t +" "));

        System.out.println();

        int x = 1;
        System.out.println(x++);
        System.out.println(x);
    }
}
