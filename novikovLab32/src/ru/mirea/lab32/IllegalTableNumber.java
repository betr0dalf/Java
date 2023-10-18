package ru.mirea.lab32;

public class IllegalTableNumber extends RuntimeException {
    public IllegalTableNumber() {
        super("Invalid table number.");
    }
}
