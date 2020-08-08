package techproed2020.day39collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class try04 {
    public static void main(String[] args) {
        Queue<String> q1  = new PriorityQueue<>();
        q1.add("A");
        q1.add("F");
        q1.add("B");
        q1.add("D");
        q1.add("C");
        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1);
    }
}
