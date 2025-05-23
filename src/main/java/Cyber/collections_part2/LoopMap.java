package Cyber.collections_part2;

import java.util.HashMap;
import java.util.Map;

public class LoopMap {
    public static void main(String[] args) {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("url", "www.joomart.com");
        dataMap.put("username", "joomart");
        dataMap.put("password", "user12345");
        dataMap.put("truckDriver", "Bobby");
        dataMap.put("storeManager", "John");

        System.out.println("+++KEYS+++++ ");
        for (String keys : dataMap.keySet()) {
            System.out.print(keys + " | ");
        }

        System.out.println();

        for (String values : dataMap.values()) {
            System.out.print(values + " | ");
        }

        System.out.println();

        for (String pairs : dataMap.keySet()) {
            System.out.println(pairs + " | " + dataMap.get(pairs));
        }

        System.out.println();

        dataMap.forEach((k, v) ->System.out.println(k + " | " + v));
    }
}
