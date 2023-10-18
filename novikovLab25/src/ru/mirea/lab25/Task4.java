package ru.mirea.lab25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String expression1 = "(3*+*5)*–*9*×*4";
        String expression2 = "((3*+*5)*–*9*×*4";

        boolean isExpression1Valid = isValid(expression1);
        boolean isExpression2Valid = isValid(expression2);

        System.out.println(expression1 + ": " + isExpression1Valid); // Выводит: (3*+*5)*–*9*×*4: true
        System.out.println(expression2 + ": " + isExpression2Valid); // Выводит: ((3*+*5)*–*9*×*4: true
    }

    private static boolean isValid(String expression) {
        Pattern pattern = Pattern.compile("\\(");
        Matcher openingMatcher = pattern.matcher(expression);

        pattern = Pattern.compile("\\)");
        Matcher closingMatcher = pattern.matcher(expression);

        int openingCount = 0;
        while (openingMatcher.find()) {
            openingCount++;
        }

        int closingCount = 0;
        while (closingMatcher.find()) {
            closingCount++;
        }

        return openingCount == closingCount;
    }
}
