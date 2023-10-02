package ru.mirea.lab14;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        // Вводимая строка для манипуляции
        String input = "Hello,123World!456";

        // Разделение строки на элементы с помощью регулярного выражения
        String[] elements = input.split("[^a-zA-Z0-9]+");

        // Вывод каждого элемента
        System.out.println("Элементы строки:");
        for (String element : elements) {
            System.out.println(element);
        }

        // Проверка элементов на соответствие определенному шаблону
        Pattern pattern = Pattern.compile("[0-9]+");
        System.out.println("Элементы, соответствующие шаблону [0-9]+:");
        for (String element : elements) {
            if (pattern.matcher(element).matches()) {
                System.out.println(element);
            }
        }
    }
}