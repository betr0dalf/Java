package ru.mirea.lab19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// task 2 - search + MVC pattern

public class SortingStudentsByGPA {
    private ArrayList<Student> iDNumber;

    public ArrayList<Student> getiDNumber() {
        return this.iDNumber;
    }
    public SortingStudentsByGPA() {
        iDNumber = new ArrayList<>();
    }
    public SortingStudentsByGPA(ArrayList<Student> iDNumber) {
        this.iDNumber = iDNumber;
    }

    public void setArray(ArrayList<Student> students) {
        iDNumber = students;
    }

    public void mergeSort() {
        Collections.sort(iDNumber, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if (student1.getAverageGPA() > student2.getAverageGPA()) {
                    return -1;
                } else if (student1.getAverageGPA() < student2.getAverageGPA()) {
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
            if (iDNumber.get(j).getAverageGPA() >= pivot.getAverageGPA()) {
                i++;
                Collections.swap(iDNumber, i, j);
            }
        }

        Collections.swap(iDNumber, i + 1, high);
        return i + 1;
    }
    public Student findStudentByFullName(String fullName) throws StudentNotFoundException {
        for (Student student : iDNumber) {
            String studentFullName = student.getName() + " " + student.getSurname();
            if (studentFullName.equalsIgnoreCase(fullName)) {
                return student;
            }
        }

        throw new StudentNotFoundException("Student with the given full name was not found: " + fullName);
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sortingStudents = new SortingStudentsByGPA();

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "Ivanov", "Math", 3, "IMBO-03-21", 4.5));
        students.add(new Student("Peter", "Petrov", "Physics", 2, "APQW-12-22", 4.2));
        students.add(new Student("Eugene", "Sidorov", "History", 4, "RMFS-44-20", 4.8));

        sortingStudents.setArray(students);

        SortingStudentsByGPA model = new SortingStudentsByGPA(sortingStudents.getiDNumber());
        SortingStudentsByGPAView view = new SortingStudentsByGPAView();

        SortingStudentsByGPAController controller = new SortingStudentsByGPAController(model, view);

        sortingStudents.mergeSort();

        System.out.println("Sorted list of students by grade point average using merge sorting:");
        controller.updateView();

        sortingStudents.setArray(students);
        sortingStudents.quicksort();

        System.out.println("Sorted list of students by grade point average using quick sort:");
        controller.updateView();

        // Поиск студента по ФИО
        try {
            Student foundStudent = sortingStudents.findStudentByFullName("Ivan Ivanov");
            System.out.println("Found student:");
            System.out.println("Name: " + foundStudent.getName());
            System.out.println("Surname: " + foundStudent.getSurname());
            System.out.println("Specialization: " + foundStudent.getSpecialization());
            System.out.println("Year: " + foundStudent.getYear());
            System.out.println("Group: " + foundStudent.getGroup());
            System.out.println("Average GPU: " + foundStudent.getAverageGPA());
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}