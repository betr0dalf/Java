package ru.mirea.lab29;

public class IllegalTableNumber extends RuntimeException {
    public IllegalTableNumber() {
        super("Invalid table number.");
    }
}
