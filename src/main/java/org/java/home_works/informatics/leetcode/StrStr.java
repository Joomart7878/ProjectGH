package org.java.home_works.informatics.leetcode;

public class StrStr {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i + needle.length() < haystack.length(); ++i) {
            String substr = haystack.substring(i, i + needle.length()); {
                if (needle.equals(substr)) {
                    return i;
                }
            }
        }
        return 0;
    }
}
