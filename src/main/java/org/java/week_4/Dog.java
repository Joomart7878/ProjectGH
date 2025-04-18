package org.java.week_4;

public class Dog {
//    public
//    private
//    package-private (default)
//    protected
    public String name;

    public Dog(String name) {
        this.name = name;
    }
    public void bark(){
        System.out.println(this.name + " barked");
    }
}
