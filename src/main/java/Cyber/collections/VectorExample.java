package Cyber.collections;

import java.util.List;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        List<String> vector = new Vector<>();

        vector.add("water");
        vector.add("tea");
        vector.add("coffee");

        for (String str : vector) {
            System.out.println(str);
        }

        System.out.println(vector.size());
        System.out.println(vector.get(2));

    }
}
