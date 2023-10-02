package ru.mirea.lab8;

import java.util.Scanner;

// task 4

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number (k): ");
        int k = in.nextInt();
        System.out.print("Enter the second number (s): ");
        int s = in.nextInt();
        int counter = 0; // счетчик количества чисел
        // Внешний цикл перебирает первую цифру числа
        for (int i = 1; i <= 9; i++) {
            counter += countNumbers(i, k - 1, s - i); // Передаем i как первую цифру в число и уменьшаем k и s на 1 и i соответственно
        }
        System.out.println("Number of " + k + "-digit numbers with sum of " + s + ": " + counter);
    }

    private static int countNumbers(int currentDigit, int remainingDigits, int remainingSum) {
        if (remainingDigits == 0) {
            if (remainingSum == 0) {
                return 1; // Найдено число с заданной суммой цифр
            } else {
                return 0; // Сумма цифр не соответствует требуемой
            }
        }
        int counter = 0;
        // Вложенный цикл перебирает оставшиеся цифры числа
        for (int i = 0; i <= 9; i++) {
            if (remainingSum >= i) {
                counter += countNumbers(i, remainingDigits - 1, remainingSum - i); // Рекурсивно вызываем функцию для каждой возможной цифры
            }
        }
        return counter;
    }
}
