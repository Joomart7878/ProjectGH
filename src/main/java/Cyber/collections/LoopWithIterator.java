package Cyber.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopWithIterator {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();

        num.add(50);
        num.add(570);
        num.add(500);
        num.add(3700);
        num.add(970);
        num.add(970);
        num.add(990);
        num.add(550);

        Iterator<Integer> it = num.iterator();

        System.out.println("it.hasNext() " + it.hasNext());
        System.out.println("it.hasNext() " + it.next());
        System.out.println("it.hasNext() " + it.next());
        System.out.println("it.hasNext() " + it.next());
        System.out.println("it.hasNext() " + it.next());
        System.out.println("it.hasNext() " + it.next());


        System.out.println();

        while (it.hasNext()) {
            System.out.print(it.next() + "|");
        }

    }
}
