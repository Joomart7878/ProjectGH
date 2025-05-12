package org.java.week_5.abstract_classes.zoo;

public class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(this.name + " barked!");
    }
}
