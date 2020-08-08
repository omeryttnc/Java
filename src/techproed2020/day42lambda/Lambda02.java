package techproed2020.day42lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Chris");
        list.add("Tucker");

        //Print the number characters of every element on the console by using "Functional Programing"

        list.stream()
                .map(String::length)
                .forEach(t-> System.out.print(t + " "));
        System.out.println();

        list.stream()
                .filter(t->t.length()>3)
                .map(t-> t + " = " + t.length())
                .forEach(t-> System.out.print(t +" "));
        System.out.println();

        list.stream()
                .map(String::length)
                .reduce(0, Integer::sum);


    }
}
