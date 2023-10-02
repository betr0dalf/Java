package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// task 2
public class SortingStudentsByGPA {
    private ArrayList<Student> iDNumber;

    public SortingStudentsByGPA() {
        iDNumber = new ArrayList<>();
    }

    public void setArray(ArrayList<Student> students) {
        iDNumber = students;
    }

    public void mergeSort() {
        Collections.sort(iDNumber, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
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
        Student pivot = iDNumber.get(high);
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
        for (Student student : iDNumber) {
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
    public void sortByField(Comparator<Student> comparator) {
        Collections.sort(iDNumber, comparator);
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sortingStudents = new SortingStudentsByGPA();

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "Ivanov", "Math", 3, "IMBO-03-21", 4.5));
        students.add(new Student("Peter", "Petrov", "Physics", 2, "APQW-12-22", 4.2));
        students.add(new Student("Eugene", "Sidorov", "History", 4, "RMFS-44-20", 4.8));

        sortingStudents.setArray(students);
        sortingStudents.mergeSort();

        System.out.println("Sorted list of students by grade point average using merge sorting:");
        sortingStudents.outArray();

        sortingStudents.setArray(students);
        sortingStudents.quicksort();

        System.out.println("Sorted list of students by grade point average using quick sort:");
        sortingStudents.outArray();
    }
}

