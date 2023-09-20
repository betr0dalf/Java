package ru.mirea.lab2;

// task 10

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();

        int wordsNum = counter(sentence);
        System.out.println("Number of words entered: " + wordsNum);
    }

    public static int counter(String sentence) {
        String[] words = sentence.split("\\s+"); // here we are splitting the sentence into words using whitespace as the delimiter
        return words.length;
    }
}