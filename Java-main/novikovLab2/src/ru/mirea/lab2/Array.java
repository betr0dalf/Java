package ru.mirea.lab2;

// task 8

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] words = {"one", "two", "three", "four", "five"};
        System.out.println("array: " + Arrays.toString(words));
        reverse(words);
        System.out.println("array reversed 1 time: " + Arrays.toString(words));
        reverse(words);
        System.out.println("array reversed 2 times: " + Arrays.toString(words));
    }

    public static void reverse(String[] array) {
        String temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
