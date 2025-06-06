package org.java.week_9;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Person joma = new Person(36, "Joomart", "Ulan2");
        ObjectOutputStream oos = new ObjectOutputStream(System.out);
        oos.writeObject(joma);
        oos.flush();
    }
}
