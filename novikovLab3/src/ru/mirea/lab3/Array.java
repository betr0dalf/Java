package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Random;

// task 1

public class Array {
    public static void main(String[] args) {
        int size = 10;
        double maxValue = 100.0;

        // with Math.random()
        double[] array1 = new double[size];
        for (int i = 0; i < size; i++) {
            array1[i] = Math.random() * maxValue;
        }
        System.out.println("Generated array using Math.random():");
        for (double element : array1) {
            System.out.print(element + " ");
        }
        System.out.println();

        Arrays.sort(array1);

        System.out.println("\nSorted array using Math.random():");
        for (double element : array1) {
            System.out.print(element + " ");
        }
        System.out.println();

        // with class Random
        double[] array2 = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array2[i] = random.nextDouble(101);
        }
        System.out.println("\nGenerated array using Random class:");
        for (double element : array2) {
            System.out.print(element + " ");
        }
        System.out.println();

        Arrays.sort(array2);

        System.out.println("\nSorted array using Random class:");
        for (double element : array2) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
