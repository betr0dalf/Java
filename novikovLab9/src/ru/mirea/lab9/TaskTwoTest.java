package ru.mirea.lab9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// task 2

public class TaskTwoTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Создаем экземпляры студентов с разными итоговыми баллами
        Student student1 = new Student(1, "Eugene", 3.8);
        Student student2 = new Student(2, "Alice", 4.2);
        Student student3 = new Student(3, "Bob", 3.6);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println("List of students before sort:");
        for (Student student : students) {
            System.out.println(student.toString());
        }

        // Сортируем список студентов с помощью компаратора SortingStudentsByGPA
        Collections.sort(students, new SortingStudentsByGPA());

        System.out.println("List of students after sort:");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}

