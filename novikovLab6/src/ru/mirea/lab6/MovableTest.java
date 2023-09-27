package ru.mirea.lab6;

// task 1

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(0, 0, 1, 1);
        System.out.println("Movable Point before move:");
        System.out.println(movablePoint);

        movablePoint.moveUp();
        movablePoint.moveRight();
        System.out.println("Movable point after move:");
        System.out.println(movablePoint);

        MovableCircle movableCircle = new MovableCircle(0, 0, 1, 1, 5);
        System.out.println("Movable circle before move:");
        System.out.println(movableCircle);

        movableCircle.moveDown();
        movableCircle.moveLeft();
        System.out.println("Movable circle after move:");
        System.out.println(movableCircle);
    }
}

