package flip;
/*
Before Sorting:
33: Z
99: I
22: A
55: B
88: X
44: M
 */

import java.util.*;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class week_8 {
    public static void main(String[] args) {
        HashMap<Integer, String> addValue = new HashMap<>();
        addValue.put(33, "Z");
        addValue.put(99, "I");
        addValue.put(22, "A");
        addValue.put(55, "B");
        addValue.put(88, "X");
        addValue.put(44, "M");

        System.out.println(addValue);
        Map<Integer, String> sortedMapKey = addValue
                .entrySet()
                .stream()
                .sorted(comparingByKey())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println(sortedMapKey);
        Map<Integer,String> sortedMapValue = addValue
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (e1,e2) ->e2,LinkedHashMap::new));
        System.out.println(sortedMapValue);


    }
}
