package youtube2;

import java.util.HashMap;
import java.util.Map;

public class Map_Key_Value {
    public static void main(String[] args) {
        Map<String ,String> fruits = new HashMap<>();
        fruits.put("red","Apple");
        fruits.put("yellow","Apple");
        fruits.put("brown","smt");
        fruits.put("pink","Strawberry");

        System.out.println(fruits.get("red"));
        for (Map.Entry pairEntry : fruits.entrySet()
             ) {
            System.out.println(pairEntry.getKey() +" : " + pairEntry.getValue());

        }

    }
}
