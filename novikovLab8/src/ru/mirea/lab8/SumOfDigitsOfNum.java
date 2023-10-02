package ru.mirea.lab8;

import java.util.Scanner;

// task 5

public class SumOfDigitsOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = in.nextInt();
        System.out.println("Sum of digits: " + sumOfDigits(N));
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }
}
