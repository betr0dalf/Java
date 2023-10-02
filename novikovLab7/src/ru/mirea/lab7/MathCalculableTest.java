package ru.mirea.lab7;

// task 4

public class MathCalculableTest {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        double result = mc1.power(2, 3);
        System.out.println("2 raised to the power of 3 is: " + result);

        result = mc1.absolute(3, 4);
        System.out.println("The absolute value of the complex number (3 + 4i) is: " + result);

        double pi = mc1.getPI();
        System.out.println("The value of PI is: " + pi);
    }
}
