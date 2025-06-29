package Discret_Math.home_works.Java.solutions;

import java.util.HashSet;

public class Longest_Palindrom {
    public int longestPalindrom(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashSet<Character> hash_set = new HashSet<Character>();
        int palindrom_length = 0;
        for (char ch : s.toCharArray()) {
            if (hash_set.contains(ch)) {
                hash_set.remove(ch);
                palindrom_length += 2;
            } else {
                hash_set.add(ch);
            }
        }

    }
}
