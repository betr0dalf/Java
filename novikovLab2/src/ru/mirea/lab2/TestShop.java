package ru.mirea.lab2;

import java.util.Locale;
import java.util.Scanner;

public class TestShop {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Shop myShop = new Shop();

        int choice = 0;
        while (choice != 4) {
            displayMenu();
            choice = getUserChoice();

            switch (choice) {
                case 1 -> addComputer(myShop);
                case 2 -> deleteComputer(myShop);
                case 3 -> findComputer(myShop);
                case 4 -> System.out.println("Exiting the program...");
                default -> System.out.println("Invalid choice, please choose a number between 1 and 4!");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("My Shop\n");
        System.out.println("1. Add a computer");
        System.out.println("2. Delete a computer");
        System.out.println("3. Find a computer");
        System.out.println("4. Exit the program\n");
    }

    private static int getUserChoice() {
        System.out.print("Enter your choice (1-4): ");
        return in.nextInt();
    }

    private static void addComputer(Shop shop) {
        System.out.print("Enter the serial number of the computer: ");
        String serialNumber = in.next();
        System.out.print("Enter the price of the computer: $");
        double price = in.nextDouble();
        shop.add(serialNumber, price);
        System.out.println("Computer added to the shop.\n");
    }

    private static void deleteComputer(Shop shop) {
        System.out.print("Enter the serial number of the computer to delete: ");
        String serialNumber = in.next();
        boolean deleted = shop.delete(serialNumber);
        if (deleted) {
            System.out.println("Computer deleted from the shop.\n");
        } else {
            System.out.println("Computer not found in the shop.\n");
        }
    }

    private static void findComputer(Shop shop) {
        System.out.print("Enter the serial number of the computer to find: ");
        String serialNumber = in.next();
        Computer computer = shop.find(serialNumber);
        if (computer != null) {
            System.out.println("Computer found in the shop:");
            System.out.println("Serial Number: " + computer.getSerialNumber());
            System.out.println("Price: $" + computer.getPrice());
            System.out.println();
        } else {
            System.out.println("Computer not found in the shop.\n");
        }
    }
}
