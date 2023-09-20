package ru.mirea.lab2;
import java.util.Locale;
import java.util.Scanner;

// task 2

public class TestBall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US); // to use dotes instead of commas in double
        double x, y;
        System.out.print("enter x: ");
        x = in.nextDouble();
        System.out.print("enter y: ");
        y = in.nextDouble();
        Ball b1 = new Ball(x, y);
        Ball b2 = new Ball();
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        b1.move(3.5,-2.91);
        b2.move(9.9, -8.8);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b1.getX() + b2.getX());
        System.out.println(b1.getY() - b2.getY());
        // strange answers because double is worse than BigDecimal in accuracy
        b1.setY(3.2);
        b2.setX(3.9);
        System.out.println(b1.getY());
        System.out.println(b2.getX());
    }
}
