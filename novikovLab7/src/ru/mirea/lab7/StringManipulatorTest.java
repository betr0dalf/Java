package ru.mirea.lab7;

import java.util.Locale;
import java.util.Scanner;

// task 5

public class StringManipulatorTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        System.out.print("Enter the text: ");
        String s = in.nextLine();

        StringManipulator manipulator = new StringManipulatorImpl();

        int characterCount = manipulator.countCharacters(s);
        System.out.println("Number of characters in the string: " + characterCount);

        String oddCharacters = manipulator.getOddCharacters(s);
        System.out.println("String with odd-position characters: " + oddCharacters);

        String reversedString = manipulator.reverseString(s);
        System.out.println("Reversed string: " + reversedString);
    }
}
