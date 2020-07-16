package techproed2020.day21lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
        /*
        what is the difference between Arrays and Lists?
        1) Arrays are fixed in length but Lists are flexible in length.
Lists are resizable Arrays
         */

//1 way
        ArrayList<String> l1 = new ArrayList<String>();
//2 way
        ArrayList<String> l2 = new ArrayList<>();

//3 way
        List <String> l3 = new ArrayList<>();

        l3.add("John");
        l3.add("Angie");
        l3.add(1,"Mark");
        l3.add(2,"Trump");
        System.out.println(l3);
        l3.add(0,"omer");
        System.out.println(l3);
   // l3.add(5,"ali");
//Note: If you use index more than length to add elements you will get
        //Run Time Error ==> l3.add(11, "X"); ==> Run Time Error
        l2.add("x");
        l2.add("Y");
        l3.addAll(l2);
        System.out.println(l3);
        l3.addAll(0,l2);
        System.out.println(l3);
        l3.addAll(2,l2);
        System.out.println(l3);
        //l3.size();
        System.out.println(l3.size());
        System.out.println(  l3.isEmpty());

        l3.remove("Trump");
        System.out.println(l3);

        l3.remove("x");
        System.out.println(l3);
        System.out.println( l3.remove(2));
        System.out.println(l3);
        System.out.println( l3.contains("X"));
        Collections.sort(l3);
        System.out.println(l3);
l3.add(0,"mahmut");
        System.out.println(l3);
    }
}
