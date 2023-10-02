package ru.mirea.lab9;

// task 1

public class SortingTest {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student(7);
        students[1] = new Student(6);
        students[2] = new Student(3);
        students[3] = new Student(2);
        students[4] = new Student(8);
        students[5] = new Student(1);
        students[6] = new Student(9);
        students[7] = new Student(0);
        students[8] = new Student(5);
        students[9] = new Student(4);

        System.out.print("Before insertion sort: ");
        for (Student student : students) {
            System.out.print(student.getIDNumber() + " ");
        }

        insertionSort(students);
        System.out.println();

        System.out.print("After insertion sort: ");
        for (Student student : students) {
            System.out.print(student.getIDNumber() + " ");
        }
    }

    // Сортировка вставками - берём каждый последующий элемент и вставляем его на нужную позицию (сравнивая с каждым числом до него)
    public static void insertionSort(Student[] students) {
        int length = students.length;
        for (int i = 1; i < length; ++i) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
}
