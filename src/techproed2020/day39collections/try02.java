package techproed2020.day39collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class try02 {
    public static void main(String[] args) {
        Set<String> lhset =new LinkedHashSet<>();
        lhset.add("Mahmit");
        lhset.add("Maho");
        lhset.add("Mithat");
        lhset.add("Mat");
        lhset.add("Hamit");
        lhset.add(null);
        System.out.println(lhset);
    }
}
