package techproed2020.day39collections;

import java.util.LinkedList;
import java.util.Queue;

public class try03 {
    public static void main(String[] args) {


        Queue<String> q1 = new LinkedList<>();
        q1.add("Mahmit");
        q1.add("Maho");
        q1.add("Mithat");
        q1.add("Mat");
        q1.add("Hamit");
        System.out.println(q1);
        System.out.println( q1.remove());
        System.out.println(q1);
        q1.remove();

    }
}