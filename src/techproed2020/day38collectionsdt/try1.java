package techproed2020.day38collectionsdt;

import java.util.HashSet;

public class try1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Omer");
        hs.add("hasan");
        hs.add("kasim");
        hs.add("murat");
        hs.add("ali");
        hs.add("Omer");
        hs.add(null);
        System.out.println(hs);

    }
}