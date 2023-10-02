package ru.mirea.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String input1 = "29/02/2000";
        String input2 = "30/04/2003";
        String input3 = "01/01/2003";
        String input4 = "29/02/2001";
        String input5 = "30-04-2003";
        String input6 = "1/1/1899";


        boolean matches1 = hasData(input1);
        boolean matches2 = hasData(input2);
        boolean matches3 = hasData(input3);
        boolean matches4 = hasData(input4);
        boolean matches5 = hasData(input5);
        boolean matches6 = hasData(input6);

        System.out.println(input1 + ": " + matches1);
        System.out.println(input2 + ": " + matches2);
        System.out.println(input3 + ": " + matches3);
        System.out.println(input4 + ": " + matches4);
        System.out.println(input5 + ": " + matches5);
        System.out.println(input6 + ": " + matches6);
    }
    private static boolean hasData(String input) {
        String pattern = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|[2-9]\\d{3})$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);
        return matcher.find();
    }
}
