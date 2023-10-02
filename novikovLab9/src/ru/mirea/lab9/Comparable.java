package ru.mirea.lab9;

public interface Comparable<T> {
    int compareTo(T other);
}

class Student2 implements Comparable<Student> {
    private String name;
    private double GPA;

    public Student2(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.GPA, other.GPA);
    }
}

