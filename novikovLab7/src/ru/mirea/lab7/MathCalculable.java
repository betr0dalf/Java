package ru.mirea.lab7;

// task 4

public interface MathCalculable {
    double power(double base, double exponent);
    double absolute(double real, double imaginary);
    double getPI();
}

class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double absolute(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public double getPI() {
        return Math.PI;
    }
}
