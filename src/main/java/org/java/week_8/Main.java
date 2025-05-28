package org.java.week_8;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/main/java/org/java/week_8/input.txt");
        byte[] allBytes = is.readAllBytes();
        String result = new String(allBytes);
        System.out.println(result);

        Reader reader = new FileReader("src/main/java/org/java/week_8/input.txt");
        char[] input = new char[256];
        reader.read(input);
        System.out.println(new String(input));



    }
}
