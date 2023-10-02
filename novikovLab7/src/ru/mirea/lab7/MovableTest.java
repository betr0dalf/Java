package ru.mirea.lab7;

// task 3

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 2);
        System.out.println("Initial point position: " + point);
        point.moveUp();
        System.out.println("Point moved up: " + point);
        point.moveLeft();
        System.out.println("Point moved left: " + point);
        point.moveDown();
        System.out.println("Point moved down: " + point);
        point.moveRight();
        System.out.println("Point moved right: " + point);

        MovableRectangle rectangle = new MovableRectangle(0, 0, 2, 2, 2, 2);
        System.out.println("Initial rectangle position: " + rectangle);
        rectangle.moveUp();
        System.out.println("Rectangle moved up: " + rectangle);
        rectangle.moveLeft();
        System.out.println("Rectangle moved left: " + rectangle);
        rectangle.moveDown();
        System.out.println("Rectangle moved down: " + rectangle);
        rectangle.moveRight();
        System.out.println("Rectangle moved right: " + rectangle);

        System.out.println("Speed test result for the rectangle: " + rectangle.speedTest());
    }
}


