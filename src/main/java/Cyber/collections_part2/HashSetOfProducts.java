package Cyber.collections_part2;

import org.java.week_5.interfaces.Circle;

import java.util.HashSet;
import java.util.Set;

public class HashSetOfProducts {
    public static void main(String[] args) {

        Set<Integer> productSet = new HashSet<>();

        productSet.add(388);
        productSet.add(438);
        productSet.add(666);
        productSet.add(555);

        for (Integer n : productSet) {
            System.out.print(n + " | ");
        }

        System.out.println();

        productSet.forEach(n -> System.out.print(n + " | "));
    }
}
