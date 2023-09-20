package ru.mirea.lab2;

// task 4

import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void add(String serialNumber, double price) {
        Computer computer = new Computer(serialNumber, price);
        computers.add(computer);
    }

    public boolean delete(String serialNumber) {
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getSerialNumber().equals(serialNumber)) {
                computers.remove(i);
                return true;
            }
        }
        return false;
    }

    public Computer find(String serialNumber) {
        for (Computer computer : computers) {
            if (computer.getSerialNumber().equals(serialNumber)) {
                return computer;
            }
        }
        return null;
    }
}

class Computer {
    private String serialNumber;
    private double price;

    public Computer(String serialNumber, double price) {
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }
}