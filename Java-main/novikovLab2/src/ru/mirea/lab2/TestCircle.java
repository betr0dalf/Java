package ru.mirea.lab2;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.5);

        System.out.println("Circle 1 - Radius: " + circle1.getRadius());
        System.out.println("Circle 1 - Area: " + circle1.calculateArea());
        System.out.println("Circle 1 - Length: " + circle1.calculateLength());

        System.out.println("Circle 2 - Radius: " + circle2.getRadius());
        System.out.println("Circle 2 - Area: " + circle2.calculateArea());
        System.out.println("Circle 2 - Length: " + circle2.calculateLength());

        System.out.println("Comparing circles...");
        System.out.println("Circle 1 and Circle 2 are equal? " + circle1.compareCircles(circle2));
    }
}
