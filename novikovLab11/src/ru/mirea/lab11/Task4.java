package ru.mirea.lab11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Get user input
        Scanner scanner = new Scanner(System.in);

        // Input year, month and day
        System.out.print("Enter year (YYYY): ");
        int year = scanner.nextInt();
        System.out.print("Enter month (MM): ");
        int month = scanner.nextInt();
        System.out.print("Enter day (DD): ");
        int day = scanner.nextInt();

        // Input hours and minutes
        System.out.print("Enter hours (HH): ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes (mm): ");
        int minutes = scanner.nextInt();

        // Create Date object
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateString = String.format("%04d-%02d-%02d %02d:%02d", year, month, day, hours, minutes);
        try {
            Date date = dateFormat.parse(dateString);
            System.out.println("Date object: " + date);
        } catch (ParseException e) {
            System.out.println("Invalid date and time format.");
        }

        // Create Calendar object
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes);
        System.out.println("Calendar object: " + calendar.getTime());
    }
}