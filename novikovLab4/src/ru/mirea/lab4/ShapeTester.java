package ru.mirea.lab4;

public class ShapeTester {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println(circle.toString());
        System.out.println();

        Shape rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.toString());
        System.out.println();

        Shape square = new Square(5);
        System.out.println(square.toString());
        System.out.println();
    }
}
