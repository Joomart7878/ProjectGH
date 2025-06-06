package org.java.week_9;

import java.io.Serializable;

public class Human implements Serializable {
    private int age;

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" + "age=" + age + '}';
    }
}
