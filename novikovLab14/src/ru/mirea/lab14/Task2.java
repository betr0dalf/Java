package ru.mirea.lab14;

import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String input1 = "abcdefghijklmnopqrstuv18340";
        String input2 = "abcdefghijklmnoasdfasdpqrstuv18340.";
        String input3 = "I love Java!!!";

        boolean isValid1 = isValidString(input1);
        boolean isValid2 = isValidString(input2);
        boolean isValid3 = isValidString(input3);

        System.out.println(input1 + ": " + isValid1); // Выводит: abcdefghijklmnopqrstuv18340: true
        System.out.println(input2 + ": " + isValid2); // Выводит: abcdefghijklmnoasdfasdpqrstuv18340.: false
        System.out.println(input3 + ": " + isValid3); // Выводит: I love Java!!!: false
    }

    private static boolean isValidString(String input) {
        String pattern = "^abcdefghijklmnopqrstuv18340$";
        return Pattern.matches(pattern, input);
    }
}
