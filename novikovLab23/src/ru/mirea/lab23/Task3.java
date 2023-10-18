package ru.mirea.lab23;

public class Task3 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Start the program via cmd");
            return;
        }

        double x = Double.parseDouble(args[0]);
        // x^2 - 2x + 1
        // double x = 4;
        // 16 - 8 + 1 = 0
        // double x = 3;
        // 9 - 6 + 1 = 4
        Expression expression = new Add(
                new Subtract(
                        new Multiply(new Variable("x"), new Variable("x")),
                        new Multiply(new Const(2), new Variable("x"))
                ),
                new Const(1)
        );

        double result = expression.evaluate(x);
        System.out.println("Result: " + result);
    }
}
