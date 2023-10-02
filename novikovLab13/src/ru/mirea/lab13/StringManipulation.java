package ru.mirea.lab13;

import java.util.Scanner;

// task 1 + 5%

public class StringManipulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any line: ");
        String input = in.nextLine(); // I like Java!!!

        char lastChar = input.charAt(input.length() - 1);
        System.out.println("Last symbol of the line: " + lastChar);

        boolean endsWithExclamation = input.endsWith("!!!");
        System.out.println("Line ends with '!!!': " + endsWithExclamation);

        boolean startsWithILike = input.startsWith("I like");
        System.out.println("Line starts with 'I like': " + startsWithILike);

        boolean containsJava = input.contains("Java");
        System.out.println("Line contains 'Java': " + containsJava);

        int javaPosition = input.indexOf("Java");
        System.out.println("Position of the substring 'Java': " + javaPosition);

        String replacedString = input.replace('a', 'o');
        System.out.println("Replaced line: " + replacedString);

        String uppercaseString = input.toUpperCase();
        System.out.println("Upper case line: " + uppercaseString);

        String lowercaseString = input.toLowerCase();
        System.out.println("Lower case line: " + lowercaseString);

        String substring = input.substring(7, 11);
        System.out.println("Substring: " + substring);
    }
}
