package Cyber.collections_part2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Double> items = new HashMap<>();

        items.put("Apple", 3.49);
        items.put("Flowers", 35.39);
        items.put("Eggs", 2.11);
        items.put("Milks", 4.2);
        items.put("Cherries", 55.4);

        System.out.println(items.size());
        System.out.println(items.toString());

        System.out.println(items.isEmpty());
        System.out.println(items.get("Apple"));
        System.out.println(items.get("Milks"));

        System.out.println(items.remove("Flowers"));

        System.out.println(items.toString());

        items.replace("Cherries", items.get("Cherries") + 2);
        System.out.println(items.get("Cherries"));
    }
}
