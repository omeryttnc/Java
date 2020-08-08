package techproed2020.day42lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class try1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(9);
        list.add(13);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(15);

        Collections.sort(list);


        for (int w : list
        ) {
            System.out.print(w + " ");

        }
        System.out.println();
        list
                .forEach(t -> System.out.print(t));
        System.out.println();
        list.stream()
                .forEach(System.out::print);

        System.out.println();
        list.forEach(System.out::print);

        System.out.println();
        list.stream()
                .filter(t -> t % 2 == 0)
                .distinct()
                .forEach(t -> System.out.print(t + " "));
        System.out.println();

        list.stream()
                .distinct()
                .filter(t -> t % 3 == 0)
                .forEach(System.out::print);

        list.stream()
                .filter(t -> t % 2 != 0)
                .map(t -> t * t)
                .forEach(System.out::print);

        System.out.println();
        list.stream()
                .filter(t -> t % 2 == 0)
                .distinct()
                .map(t -> t * t * t)
                .forEach(t -> System.out.print(t + " "));

        System.out.println("****************************");
        List<String> list2 = new ArrayList<String>();
        list2.add("Ali");
        list2.add("Mark");
        list2.add("Jackson");
        list2.add("Amanda");
        list2.add("Chris");
        list2.add("Tucker");

        list2.stream()
                .map(t -> t + " = " + t.length())
                .forEach(t -> System.out.println(t + " "));


        list2.stream()
                .filter(t -> t.length() > 5)
                .map(t -> t + " = " + t.length())
                .forEach(t -> System.out.print(t + " "));

        System.out.println();
        System.out.println(list2.stream()
                .map(String::length)
                //  .reduce(Integer::sum);
                //  .reduce(0,(u,t)->u+t));
                .reduce(0, Integer::sum));


        System.out.println("***********s");
        System.out.println(list2.stream()
                .map(t -> t + "!")
                .filter(t -> t.contains("k"))
                .map(String::length)
                .reduce(0, Integer::sum));
        System.out.println();
        // .forEach(t-> System.out.println(t+" "));
        System.out.println(list2.stream()
                .filter(t -> t.startsWith("A"))
                .map(String::length)
                .reduce(1, (u, t) -> u * t));

        System.out.println();

        list2.stream()
                .filter(t -> t.length() < 6)
                .sorted()
                .forEach(t -> System.out.print(t + " "));

        System.out.println("***********************");
        System.out.println(
                list2.stream()
                        .map(String::length)
                        .sorted()
                .reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t: u));
                //  .reduce(t->));


        System.out.println("99999999999999999999");

        int result = list2.stream()
                .map(String::length)
                .reduce(Integer.MIN_VALUE,(u,t)-> u>t ? u :t);
        System.out.println(result);

    }
}
