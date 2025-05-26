package org.java.week_7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    static void readFile(String fileName) throws FileNotFoundException {
        FileReader in = new FileReader(fileName);

        BufferedReader br = new BufferedReader(in);

        try {
            String s = br.readLine();
            System.out.println(s);
        } catch (IOException e) {
            System.out.println("some IO error occured");
        }
    }
}
