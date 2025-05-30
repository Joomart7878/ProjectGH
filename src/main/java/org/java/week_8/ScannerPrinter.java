package org.java.week_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerPrinter {
    public static void scannerExample() throws IOException {
        try (Scanner sc = new Scanner(new FileInputStream("src/main/java/org/java/week_8/input.txt"))) {
            System.out.println(sc.nextInt());
        }
    }

    public static void printerExample() throws IOException {
        try (PrintStream ps = new PrintStream(new FileOutputStream("src/main/java/org/java/week_8/output.txt"))) {
            int age = 10;
            String name = "John";
            ps.printf("%s is %d years old\n", name, age);
        }
    }
}
