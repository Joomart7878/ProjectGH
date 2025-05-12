package org.java.week_6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(2 , 300);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
