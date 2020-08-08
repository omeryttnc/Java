package techproed2020.day44lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class try01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("John");
        list.add("Ali");
        list.add("Alexander");
        list.add("Taylor");
        list.add("Ali");
        list.add("Jackson");
        list.stream()
                .filter(t -> !t.startsWith("J"))
                .distinct()
                .sorted(Comparator.comparing(t->t.length()))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("******************");

      int result=  IntStream.rangeClosed(1,14)
                .filter(t->t%2==0)
                .reduce(1,(u,t)-> u*t);

        System.out.println(result);
        System.out.println();
        IntStream.iterate(1,t->t+2)
                .limit(12)
                .forEach(System.out::println);

        System.out.println();
        IntStream.iterate(7,t->t+2)
                .limit(5)
                .forEach(System.out::println);
    }
}
