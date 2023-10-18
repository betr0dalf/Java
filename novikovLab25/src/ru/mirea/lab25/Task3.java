package ru.mirea.lab25;

import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String input1 = "127.0.0.1";
        String input2 = "255.255.255.0";
        String input3 = "1300.6.7.8";
        String input4 = "abc.def.gha.bcd";

        boolean isValid1 = isValidString(input1);
        boolean isValid2 = isValidString(input2);
        boolean isValid3 = isValidString(input3);
        boolean isValid4 = isValidString(input4);


        System.out.println(input1 + ": " + isValid1); // Выводит: 127.0.0.1: true
        System.out.println(input2 + ": " + isValid2); // Выводит: 255.255.255.0: true
        System.out.println(input3 + ": " + isValid3); // Выводит: 1300.6.7.8: false
        System.out.println(input4 + ": " + isValid4); // Выводит: abc.def.gha.bcd: false
    }

    private static boolean isValidString(String input) {
        String pattern = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$";
        return Pattern.matches(pattern, input);
    }
}
