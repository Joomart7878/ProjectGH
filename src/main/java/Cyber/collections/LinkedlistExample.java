package Cyber.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistExample {
    public static void main(String[] args) {
        List<Integer> numberList = new LinkedList<>();

        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(1000);

        System.out.println(numberList.get(0));
        System.out.println(numberList.get(1));

        System.out.println(numberList.getFirst());

        numberList.addFirst(1);
        numberList.addLast(99);

        System.out.println(numberList.get(0));
        System.out.println(numberList.getLast());

        for (int nums : numberList) {
            System.out.println(nums);
        }


    }
}
