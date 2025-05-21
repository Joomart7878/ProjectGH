package Cyber.polymorphism;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.draw();

        Shape s2 = new Triangle();
        s2.draw();
        s1.draw();

    }
}
