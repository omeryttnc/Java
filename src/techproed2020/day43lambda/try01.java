package techproed2020.day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class try01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(8);
        list.add(5);
        list.add(9);
        list.add(3);
        System.out.println(list.stream()
                .sorted()
                .map(t -> t * t)
                .reduce(0, Integer::sum));
        System.out.println();
        List<String> list2 = new ArrayList<String>();
        list2.add("Ali");
        list2.add("Mark");
        list2.add("Jackson");
        list2.add("Amanda");
        list2.add("Ali");
        list2.add("Mark");
        list2.stream()
                .distinct()
                .sorted(Comparator.comparing(String::length))
                .map(t -> t + " = " + t.length())
                .forEach(System.out::println);

        System.out.println();
        list2.stream()
                .distinct()
                .sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
                .forEach(System.out::println);

        System.out.println();
        list2.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("********************");

        System.out.println( list2.stream()
                .filter(t->t.length()<7)
                .map(String::toUpperCase)
                .collect(Collectors.toSet()));
            }
}
