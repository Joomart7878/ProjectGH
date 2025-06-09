package org.java.home_works.informatics.leetcode;

public class FirstUniqueChar {
    public int firstUniqueCh(String s){

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            boolean ok = true;
            for (int j = i + 1; j < s.length(); ++j) {
                if (i == j) {
                    continue;
                }
                if (c == s.charAt(j)) {
                    break;
                }
            }
            if (ok) {
                return i;
        }

        }
        return -1;
    }

}
