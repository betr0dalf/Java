package ru.mirea.lab1;
import java.util.Locale;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US); // for a dot instead of a comma in double

        // task 3
        System.out.println("task 3");
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("sum = " + sum + '\n' + "avg = " + sum/array.length + '\n');

        // task 4
        System.out.println("task 4");
        System.out.print("enter the size of the array: ");
        int len = in.nextInt();
        int[] arr = new int[len];
        // array input
        System.out.print("enter the array: ");
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        // do-while
        int counterDoWhile = len - 1;
        int sumDoWhile = 0;
        do {
            sumDoWhile += arr[counterDoWhile];
            counterDoWhile--;
        } while (counterDoWhile >= 0);
        System.out.println("sum with 'do-while' = " + sumDoWhile);
        // while
        int counterWhile = 0;
        int sumWhile = 0;
        while (counterWhile < len) {
            sumWhile += arr[counterWhile];
            counterWhile++;
        }
        System.out.println("sum with 'while' = " + sumWhile);
        // search of min-max
        int min = arr[0], max = arr[0];
        for(int num : arr) {
            if (num < min) {
                min = num;
            }
            else if (num > max) {
                max = num;
            }
        }
        System.out.println("min = " + min + '\n' + "max = " + max);

        // task 6
        double num = 0;
        System.out.print("harmonic series: ");
        for (double i = 1; i < 11; i++) {
            num = 1/i;
            System.out.printf(Locale.US, "%.2f", num);
            System.out.print(" ");
        }
    }
}
