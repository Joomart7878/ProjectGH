package org.java.week_5.abstract_classes.zoo;

public abstract class Animal {

    protected String name;
    Animal(String name) {
        this.name = name;
    }
    abstract void makeSound();
}

