package ru.mirea.lab11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task3 {
    public static void main(String[] args) {
        // Create a Student object and initialize the fields
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date dateOfBirth = dateFormat.parse("01.01.2000");

            Student student = new Student("John", "Doe", "Computer Science", 2023, "Group A", 4.5, dateOfBirth);

            // Check the getters and setters
            System.out.println("Student name: " + student.getName());
            System.out.println("Student surname: " + student.getSurname());
            System.out.println("Student specialization: " + student.getSpecialization());
            System.out.println("Student year of admission: " + student.getYear());
            System.out.println("Student group: " + student.getGroup());
            System.out.println("Student average GPU: " + student.getAverageGPU());
            System.out.println("Student date of birth: " + student.getDateOfBirth());

            // Check the getFormattedDateOfBirth() method
            System.out.println("Student date of birth in 'dd.MM.yyyy' format: " + student.getFormattedDateOfBirth("dd.MM.yyyy"));
            System.out.println("Student date of birth in 'dd MMMM yyyy' format: " + student.getFormattedDateOfBirth("dd MMMM yyyy"));
            System.out.println("Student date of birth in 'dd MMMM yyyy HH:mm:ss' format: " + student.getFormattedDateOfBirth("dd MMMM yyyy HH:mm:ss"));
        } catch (ParseException e) {
            System.out.println("Wrong data format.");
        }
    }
}