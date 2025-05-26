package org.java.week_7;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        Exceptions.example();
        try {
            ReadFileExample.readFile("src/main/java/org/java/week_7/input.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

}
