package ru.mirea.lab9;

import java.util.ArrayList;
import java.util.List;

public class Unity {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();

        // Заполняем первый список данными о студентах
        list1.add(new Student(1, "Eugene", 3.8));
        list1.add(new Student(3, "Alice", 4.2));
        list1.add(new Student(2, "Bob", 3.6));

        // Заполняем второй список данными о студентах
        list2.add(new Student(4, "Emma", 4.5));
        list2.add(new Student(6, "David", 3.9));
        list2.add(new Student(5, "Sarah", 3.7));

        // Объединяем два списка в один
        List<Student> mergedList = mergeLists(list1, list2);

        // Выводим объединенный список после сортировки
        for (Student student : mergedList) {
            System.out.println(student.toString());
        }
    }

    public static List<Student> mergeLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        // Сравниваем и добавляем студентов в объединенный список
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getGPA() > list2.get(j).getGPA()) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        // Добавляем оставшиеся студенты из первого списка
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        // Добавляем оставшиеся студенты из второго списка
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
