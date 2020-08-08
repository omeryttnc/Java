package repl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cs4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Monday");
        map.put(2, "Tuesday");
        map.put(3, "Wednesday");
        map.put(4, "Thursday");
        map.put(5, "Friday");
        map.put(6, "Saturday");
        map.put(7, "Sunday");


        System.out.println(map.get(day));
    }
}
