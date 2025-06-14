package Discret_Math.home_works.Java.solutions;

public class First_Unique_Character_InString {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(freq[c - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
