package Cyber.collections;

import java.util.ArrayList;
import java.util.List;

public class LoopArrayList {
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

        System.out.println(num.toString());

        for (Integer n : num) {
            System.out.print(n + "|");
        }

        System.out.println();

        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i) + "|");
        }

        System.out.println();

        num.forEach(n -> System.out.print(n + "|"));

        System.out.println();

        num.removeIf(n -> n < 1200);
        num.forEach(n -> System.out.print(n + "|"));
    }
}
