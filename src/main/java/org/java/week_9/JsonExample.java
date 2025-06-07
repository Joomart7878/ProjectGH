package org.java.week_9;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class JsonExample {
    public static void main(String[] args) throws IOException {
        Person talgat = new Person(55, "Talgat", "Chern 24");
        Person nurzat = new Person(36,"Nurzat", "Ulan2");
        List<Person> people = new ArrayList<>();
        people.add(talgat);
        people.add(nurzat);
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(people));

        try (FileOutputStream fos = new FileOutputStream("src/main/java/org/java/week_9/people.json")){
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
            objectMapper.writeValue(fos, people);
            fos.flush();
        }

        byte[] bytes = Files.readAllBytes(Path.of("src","main","java","org","java","week_9","people.json"));
        try (ByteArrayInputStream bites = new ByteArrayInputStream(bytes)) {
            List<Person> list = objectMapper.readValue(bites, people.getClass());
            System.out.println(list);


        }
    }
}
