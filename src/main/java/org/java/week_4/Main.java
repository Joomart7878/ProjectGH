package org.java.week_4;

import org.java.week_4.zoo.Animal;
import org.java.week_4.zoo.Cat;
import org.java.week_4.zoo.Dog;

public class Main {
    public static void makeItSound (Animal animal) {
        animal.makeSound();
    }
    public static void main(String[] args) {

        Dog bobby = new Dog("Bobby");
        Cat dong = new Cat("Dong");

        makeItSound(bobby);
        makeItSound(dong);

    }
}
