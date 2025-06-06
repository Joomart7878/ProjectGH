package org.java.week_9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person joma = new Person(36, "Joomart", "Ulan2");
        try (FileOutputStream fos = new FileOutputStream("src/main/java/org/java/week_9/person.bin")){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(joma);
            oos.flush();
        }
        byte[] bytes = Files.readAllBytes(Path.of("src","main","java","org","java","week_9","person.bin"));
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytes))) {
            Object o = ois.readObject();
            Person p = (Person) o;
            System.out.println(p);
        }

    }
}
