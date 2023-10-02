package ru.mirea.lab11;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

// task 5

public class LinkedSortingStudentsByGPA {
    private LinkedList<Student2> iDNumber;
    public LinkedSortingStudentsByGPA() {
        iDNumber = new LinkedList<>();
    }

    public void setArray(LinkedList<Student2> students) {
        iDNumber = students;
    }

    public void mergeSort() {
        Collections.sort(iDNumber, new Comparator<Student2>() {
            @Override
            public int compare(Student2 student1, Student2 student2) {
                if (student1.getAverageGPU() > student2.getAverageGPU()) {
                    return -1;
                } else if (student1.getAverageGPU() < student2.getAverageGPU()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public void quicksort() {
        quicksortHelper(0, iDNumber.size() - 1);
    }

    private void quicksortHelper(int low, int high) {
        if (low < high) {
            int partitionIndex = partition(low, high);
            quicksortHelper(low, partitionIndex - 1);
            quicksortHelper(partitionIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        Student2 pivot = iDNumber.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (iDNumber.get(j).getAverageGPU() >= pivot.getAverageGPU()) {
                i++;
                Collections.swap(iDNumber, i, j);
            }
        }

        Collections.swap(iDNumber, i + 1, high);
        return i + 1;
    }

    public void outArray() {
        for (Student2 student : iDNumber) {
            System.out.println("Name: " + student.getName());
            System.out.println("Surname: " + student.getSurname());
            System.out.println("Specialization: " + student.getSpecialization());
            System.out.println("Year: " + student.getYear());
            System.out.println("Group: " + student.getGroup());
            System.out.println("Average GPU: " + student.getAverageGPU());
            System.out.println();
        }
    }

    // Метод для сортировки по другому полю
    public void sortByField(Comparator<Student2> comparator) {
        Collections.sort(iDNumber, comparator);
    }

    public static void main(String[] args) {
        LinkedSortingStudentsByGPA sortingStudents = new LinkedSortingStudentsByGPA();

        LinkedList<Student2> students = new LinkedList<>();
        students.add(new Student2("Ivan", "Ivanov", "Math", 3, "IMBO-03-21", 4.5));
        students.add(new Student2("Peter", "Petrov", "Physics", 2, "APQW-12-22", 4.2));
        students.add(new Student2("Eugene", "Sidorov", "History", 4, "RMFS-44-20", 4.8));

        sortingStudents.setArray(students);

        long startTime = System.nanoTime();

        sortingStudents.mergeSort();

        long endTime = System.nanoTime();
        long mergeSortTime = endTime - startTime;

        System.out.println("Time taken for merge sort: " + mergeSortTime + " ns");

        System.out.println("Sorted list of students by grade point average using merge sorting:");
        sortingStudents.outArray();

        sortingStudents.setArray(students);

        long startTime2 = System.nanoTime();

        sortingStudents.quicksort();

        long endTime2 = System.nanoTime();
        long mergeSortTime2 = endTime2 - startTime2;

        System.out.println("Time taken for quick sort: " + mergeSortTime2 + " ns");

        System.out.println("Sorted list of students by grade point average using quick sort:");
        sortingStudents.outArray();
    }
}

