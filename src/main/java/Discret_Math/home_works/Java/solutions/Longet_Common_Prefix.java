package Discret_Math.home_works.Java.solutions;

public class Longet_Common_Prefix {
    public String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }

        String prefix = str[0];

        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {

        Longet_Common_Prefix lcp = new Longet_Common_Prefix();

        String[] words = {"Flower", "Flow", "Flight"};

        String result = lcp.longestCommonPrefix(words);

        System.out.println(result);
    }
}
