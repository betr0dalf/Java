package ru.mirea.lab14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task7 {
    public static void main(String[] args) {
        String input1 = "F032_Password";
        String input2 = "TrySpy1";
        String input3 = "I_am_pro_hacker_2009";
        String input4 = "smart_pass";
        String input5 = "A007";
        String input6 = "WeliveWeloveWelie";


        boolean matches1 = isStrongPassword(input1);
        boolean matches2 = isStrongPassword(input2);
        boolean matches3 = isStrongPassword(input3);
        boolean matches4 = isStrongPassword(input4);
        boolean matches5 = isStrongPassword(input5);
        boolean matches6 = isStrongPassword(input6);

        System.out.println(input1 + " is a strong password: " + matches1);
        System.out.println(input2 + " is a strong password: " + matches2);
        System.out.println(input3 + " is a strong password: " + matches3);
        System.out.println(input4 + " is a strong password: " + matches4);
        System.out.println(input5 + " is a strong password: " + matches5);
        System.out.println(input6 + " is a strong password: "+ matches6);
    }
    private static boolean isStrongPassword(String input) {
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);
        return matcher.find();
    }
}
