package org.java.week_4.zoo;

public class Dog extends Animal {
//    public
//    private
//    package-private (default)
//    protected

    public Dog(String name) {
        this.name = name;
    }
    public void makeSound(){
        System.out.println(this.name + " barked!");
    }
}
