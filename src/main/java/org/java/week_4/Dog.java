package org.java.week_4;

public class Dog extends Animal {
//    public
//    private
//    package-private (default)
//    protected

    public Dog(String name) {
        this.name = name;
    }
    public void bark(){
        System.out.println(this.name + " barked");
    }
}
