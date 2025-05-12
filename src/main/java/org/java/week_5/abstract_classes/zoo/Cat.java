package org.java.week_5.abstract_classes.zoo;

public class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(this.name + " meowed!");
    }
}
