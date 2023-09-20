package ru.mirea.lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// task 4

public class CreateArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        System.out.print("enter the size of array (n >= 1): ");
        int n = in.nextInt();
        while (n < 1) {
            System.out.print("wrong number, enter the size of array (n >= 1): ");
            n = in.nextInt();
        }

        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = ThreadLocalRandom.current().nextInt(0, n + 1);
        }

        System.out.println("generated array: " + Arrays.toString(array1));

        ArrayList<Integer> array2 = new ArrayList<Integer>();
        for (int element : array1) {
            if (element % 2 == 0) {
                array2.add(element);
            }
        }

        if (array2.size() == 0) {
            System.out.println("second array is empty");
        }
        else {
            System.out.println("second array: " + array2);
        }
    }
}
