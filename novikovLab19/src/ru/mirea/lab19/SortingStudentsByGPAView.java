package ru.mirea.lab19;

import java.util.ArrayList;

class SortingStudentsByGPAView {
    public void outArray(ArrayList<Student> iDNumber) {
        for (Student student : iDNumber) {
            System.out.println("Name: " + student.getName());
            System.out.println("Surname: " + student.getSurname());
            System.out.println("Specialization: " + student.getSpecialization());
            System.out.println("Year: " + student.getYear());
            System.out.println("Group: " + student.getGroup());
            System.out.println("Average GPU: " + student.getAverageGPA());
            System.out.println();
        }
    }
}
