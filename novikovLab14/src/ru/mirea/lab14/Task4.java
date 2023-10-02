package ru.mirea.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String input1 = "(1 + 8) – 9 / 4";
        String input2 = "6 / 5 – 2 * 9";

        boolean matches1 = hasPlusAfterString(input1);
        boolean matches2 = hasPlusAfterString(input2);

        System.out.println(input1 + ": " + matches1);
        System.out.println(input2 + ": " + matches2);
    }

    private static boolean hasPlusAfterString(String input) {
        String pattern = "[^+]\\+.*";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);
        return matcher.find();
    }
}
