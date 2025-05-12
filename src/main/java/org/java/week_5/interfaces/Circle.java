package org.java.week_5.interfaces;

public class Circle extends Shape {

    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle ...");
    }

    @Override
    double area() {
        return 0;
    }
}
