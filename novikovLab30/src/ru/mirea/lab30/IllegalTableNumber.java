package ru.mirea.lab30;

public class IllegalTableNumber extends RuntimeException {
    public IllegalTableNumber() {
        super("Invalid table number.");
    }
}
