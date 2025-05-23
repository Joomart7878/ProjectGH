package Cyber.collections;

import java.util.Stack;
import java.util.Vector;

public class StackExample {
    public static void main(String[] args) {
        Vector<Integer> numList = new Stack<>();

        numList.add(50);
        numList.add(70);
        numList.add(500);
        numList.add(50);

        System.out.println(numList.toString());

        System.out.println(((Stack<Integer>) numList).peek());

        ((Stack<Integer>) numList).pop();

        System.out.println(numList.toString());

        System.out.println(((Stack<Integer>) numList).peek());
    }
}
