package ru.mirea.lab3;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

// task 3

public class IncreasingSequence {
    public static void main(String[] args) {
        int size = 4;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(10, 100);
        }
        System.out.println("generated array: " + Arrays.toString(array));

        boolean isStrictlyIncreasing = check(array);
        if (isStrictlyIncreasing) {
            System.out.println("array is a strictly increasing sequence");
        } else {
            System.out.println("array is not a strictly increasing sequence");
        }
    }
    public static boolean check(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

