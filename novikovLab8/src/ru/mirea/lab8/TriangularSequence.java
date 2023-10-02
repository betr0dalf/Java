package ru.mirea.lab8;

import java.util.Scanner;

// task 1

public class TriangularSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int currentNumber = 1;
        int counter = 1;

        for (int i = 1; i <= num; i++) {
            System.out.print(currentNumber + " ");

            if (counter == currentNumber) {
                currentNumber++;
                counter = 1;
            } else {
                counter++;
            }
        }
    }
}
