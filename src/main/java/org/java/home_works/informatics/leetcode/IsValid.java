package org.java.home_works.informatics.leetcode;

public class IsValid {
    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;

        }
        if (s.length() % 2 == 1) {
            return false;
        }
        char l = s.charAt(0);
        char r = s.charAt(s.length() - 1);

        if( l == '(' && r == ')') {
            if (isValid(s.substring(1, s.length() - 1))) {
                return true;
            }
        }
        if( l == '[' && r == ']') {
            if (isValid(s.substring(1, s.length() - 1))) {
                return true;
            }
        }
        if( l == '{' && r == '}') {
            if (isValid(s.substring(1, s.length() - 1))) {
                return true;
            }
        }
        for (int i = 2; i + 1 < s.length(); i += 2) {
            String left = s.substring(0,i);
            String right = s.substring(i, s.length());
            if (isValid(left) && isValid(right)) {
                return true;
            }
        }
        return false;
    }
}
