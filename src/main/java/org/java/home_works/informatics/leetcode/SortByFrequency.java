package org.java.home_works.informatics.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByFrequency {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            Integer count = counter.get(c);
            if (count == null) {
                counter.put(c, 1);
            } else {
                counter.put(c, count + 1);
            }
        }
        HashMap<Integer, List<Character>> reversedCounter = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            int count = entry.getValue();
            char c = entry.getKey();
            List<Character> l = reversedCounter.get(count);
            if (l == null) {
                l = new ArrayList<>();
            }
            l.add(c);
            reversedCounter.put(count, l);
        }
        System.out.println(reversedCounter);
        StringBuilder result = new StringBuilder();
        for (int i = s.length(); i >= 1 ; --i) {
            List<Character> l = reversedCounter.get(i);
            if (l == null) {
                continue;
            }
            System.out.println(i + " " + l);
            for (char c : l) {
                for (int j = 0; j < 1; ++j) {
                    result.append(String.valueOf(c).repeat(i));
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        frequencySort("tree");
    }
}