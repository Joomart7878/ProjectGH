package Cyber.abstractions;

public class Dog extends Animal{

    @Override
    void eat() {
        System.out.println("Dog Food");
    }

    @Override
    void breath() {
        System.out.println("Fish is breathing under water");
    }

}

