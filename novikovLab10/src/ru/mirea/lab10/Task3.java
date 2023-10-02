package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// task 3

public class Task3 {
    public static void main(String[] args) {
        // Создаем два списка студентов
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Ivan", "Ivanov", "Informatics", 1, "IKMB-01-23", 4.5));
        students1.add(new Student("Peter", "Petrov", "Math", 2, "SMND-02-22", 3.9));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Ignat", "Isakov", "Physics", 3, "AKMK-03-21", 4.2));
        students2.add(new Student("Salazar", "Kozlov", "Chemistry", 4, "RPWT-04-20", 4.8));

        // Объединяем списки
        List<Student> combinedStudents = new ArrayList<>(students1);
        combinedStudents.addAll(students2);

        // Сортируем список по имени и фамилии
        Collections.sort(combinedStudents, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                int result = student1.getName().compareTo(student2.getName());
                if (result == 0) {
                    result = student1.getSurname().compareTo(student2.getSurname());
                }
                return result;
            }
        });

        // Выводим отсортированный список
        for (Student student : combinedStudents) {
            System.out.println("Name: " + student.getName());
            System.out.println("Surname: " + student.getSurname());
            System.out.println("Specialization: " + student.getSpecialization());
            System.out.println("Year: " + student.getYear());
            System.out.println("Group: " + student.getGroup());
            System.out.println("Average GPU: " + student.getAverageGPU());
            System.out.println();
        }
    }
}

