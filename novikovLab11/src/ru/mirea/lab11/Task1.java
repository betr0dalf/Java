package ru.mirea.lab11;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        // Developer's last name
        String lastName = "Novikov";

        // Date and time the task was received
        Date startDate = new Date(); // current date and time

        // Date and time the task is due
        Date endDate = new Date(System.currentTimeMillis() + 86400000); // current date + 1 day

        // Display the information
        System.out.println("Developer's Surname: " + lastName);
        System.out.println("Date and time the task was received: " + startDate);
        System.out.println("Date and time the task is due: " + endDate);
    }
}
