package ru.mirea.lab20;

// task 4

public class CalculatorTest {
    public static void main(String[] args) {
        testSum();
        testMultiply();
        testDivide();
        testSubtraction();
    }

    public static void testSum() {
        double result = Calculator.sum(10, 5.5);
        System.out.println("Sum: " + result);
    }

    public static void testMultiply() {
        double result = Calculator.multiply(4, 2.5);
        System.out.println("Multiplication: " + result);
    }

    public static void testDivide() {
        double result = Calculator.divide(10, 2);
        System.out.println("Division: " + result);
    }

    public static void testSubtraction() {
        double result = Calculator.subtraction(7.5, 2);
        System.out.println("Subtraction: " + result);
    }
}
