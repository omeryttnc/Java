package techproed2020.day39collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class try01 {
    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1);

        Set<String> tset = new TreeSet<>();
        tset.add("omer");
        tset.add("hasan");
        tset.add("kasim");
        tset.add("murat");
        tset.add("ali");
        tset.add("omer");
        System.out.println(tset);
        LocalTime lt2 = LocalTime.now();
        System.out.println(lt2);

        Set<String> hset = new HashSet<>();
        hset.add("omer");
        hset.add("hasan");
        hset.add("kasim");
        hset.add("murat");
        hset.add("ali");
        hset.add("omer");
        System.out.println(hset);
        LocalTime lt3 = LocalTime.now();
        System.out.println(lt3);

        Set<String> tset2 = new TreeSet<>(hset);
        System.out.println(tset2);

        LocalTime lt4 = LocalTime.now();
        System.out.println(lt4);
    }

}
