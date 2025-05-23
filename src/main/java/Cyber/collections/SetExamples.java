package Cyber.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();

        mySet.add(100);
        mySet.add(500);
        mySet.add(800);
        mySet.add(900);
        mySet.add(1000);
        mySet.add(1000);
        mySet.add(1000);

        System.out.println(mySet.toString());
        System.out.println(mySet.size());

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(500);
        treeSet.add(100);
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(8000);
        treeSet.add(200);

        System.out.println(treeSet.toString());

    }
}
