package Cyber.polymorphism;

public class ShapesAray {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Square();
        shapes[1] = new Triangle();
        shapes[2] = new Circle();


        for (Shape sh : shapes) {
            System.out.println(sh.getClass().getName());
            sh.draw();
        }
    }
}
