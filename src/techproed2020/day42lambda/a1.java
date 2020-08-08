package techproed2020.day42lambda;

import Utilities.Utilities;

import java.util.ArrayList;
import java.util.List;

public class a1 {
 /*
	 1)Create a package, name it as "day42lambdadt"
	 2)Create a class, name it as Lambda01
	 */

	/*
	 1)Lambda is "Functional Programming"
	 2)Until now, we used "Structured Programming"
	 */

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

        //Print all elements on the console one by one by using "Structured Programming"
        //1. Way
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //2. Way
        for (int w : list) {
            System.out.print(w + " ");
        }
        System.out.println();

        //Print all elements on the console one by one by using "Functional Programming"
        //1. Way
        list.stream()
                .forEach(t -> System.out.print(t + " "));// t -> Action with "t" ==> Lambda Expression
        System.out.println();
        //2. Way
        list.stream()
                .forEach(System.out::print);//System.out::print ==> Method reference ==> Class Name :: Method Name from the class
        System.out.println();
        System.out.println("**********************");
        list.stream()
                .filter(t -> t % 2 == 0)
                .forEach(System.out::print);



        /*
        print all elements divisible by 3
         */
        System.out.println();
        System.out.println("***********");

        list.stream()
                .filter(t -> t % 3 == 0)
                .forEach(System.out::print);
        System.out.println(Utilities.isEven(584));
        System.out.println();

        list.stream()
                .filter(t -> t % 2 != 0)
                .map(t -> t * t)
                .forEach(t -> System.out.print(t + " "));

        System.out.println();
        list.stream()
                .filter(t -> t % 2 == 0)
                .map(t -> t * t * t)
                .forEach(t -> System.out.print(t + " "));


    }


}
