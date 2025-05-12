package org.java.week_5.interfaces;

public class Paint {
    // Shape
    // Circle
    // Rectangle
    // + draw()
    static void drawEverything (Drawable []staffToDraw) {

        for (Drawable drawable : staffToDraw) {
            drawable.draw();
        }
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(1,2);

        drawEverything(new Drawable[]{
                cat,
                circle,
                rectangle
        });
    }


}
