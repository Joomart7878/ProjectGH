package Cyber.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueuExampele {
    public static void main(String[] args) {
        Queue<String> queueList = new LinkedList<>();

        queueList.add("Mike");
        queueList.add("Ozzy");
        queueList.add("Asiya");
        queueList.add("Jamal");

        System.out.println(queueList.toString());

        String name = queueList.remove();

        System.out.println(name);

        name = queueList.poll();
        System.out.println(name);
    }
}
