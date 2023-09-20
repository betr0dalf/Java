package ru.mirea.lab4;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setElement(0, 0, 1.0);
        matrix1.setElement(0, 1, 2.0);
        matrix1.setElement(1, 0, 3.0);
        matrix1.setElement(1, 1, 4.0);

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setElement(0, 0, 2.0);
        matrix2.setElement(0, 1, 4.0);
        matrix2.setElement(1, 0, 6.0);
        matrix2.setElement(1, 1, 8.0);

        System.out.println("Matrix 1:");
        matrix1.print();

        System.out.println("\nMatrix 2:");
        matrix2.print();

        Matrix sum = matrix1.add(matrix2);
        System.out.println("\nSum of matrices:");
        sum.print();

        Matrix product = matrix1.multiply(2.0);
        System.out.println("\nMatrix 1 multiplied by 2.0:");
        product.print();

        Matrix product2 = matrix1.multiply(matrix2);
        System.out.println("\nProduct of matrices:");
        product2.print();
    }
}
