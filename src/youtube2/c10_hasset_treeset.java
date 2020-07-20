package youtube2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class c10_hasset_treeset {
    public static void main(String[] args) {
        Set<Integer> hasset = new HashSet<>();
        Set<Integer> treeset = new TreeSet<>();
        hasset.add(5);
        hasset.add(5);
        hasset.add(15);
        hasset.add(23);
        hasset.add(15);
        for (int w : hasset
             ) {
            System.out.print(w +" ");
        }
            System.out.println();

        treeset.add(5);
        treeset.add(5);
        treeset.add(15);
        treeset.add(23);
        treeset.add(15);
        treeset.add(1);
        for (int w : treeset
        ) {
            System.out.print(w +" ");
        }


            /*
            hasset kafasina gore siraliyor ve ayni variable dan
            iki tane koyamiyorsun. treeset in farki ise direk kucukten buyuge
            dogru siraliyor ama yine iki tane ayni elemenenti koyamiyorsun
             */

    }
}
