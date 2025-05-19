package org.java.week_7;

public class Exceptions {
    public static void main(String[] args) {
        try {
            String s = null;
            s.charAt(7);
        } catch (NullPointerException e) {
            System.out.println("Caught NPE!");
        }
    }
}
