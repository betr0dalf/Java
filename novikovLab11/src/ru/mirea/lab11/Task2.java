package ru.mirea.lab11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Date today = new Date();
        System.out.print("Enter date and time in this format 'dd.MM.yyyy HH:mm:ss': ");
        String line = in.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        try {
            Date userDate = dateFormat.parse(line);

            // Сравниваем даты
            if (userDate.before(today)) {
                System.out.println("Current date: " + today);
                System.out.println("Entered date: " + userDate);
                System.out.println("The entered date is earlier than the current date and time.");
            } else if (userDate.after(today)) {
                System.out.println("Current date: " + today);
                System.out.println("Entered date: " + userDate);
                System.out.println("The entered date is later than the current date and time.");
            } else {
                System.out.println("The entered date matches the current date and time.");
            }
        } catch (ParseException e) {
            System.out.println("Wrong data format.");
        }
    }
}
