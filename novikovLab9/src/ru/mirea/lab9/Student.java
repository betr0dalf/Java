package ru.mirea.lab9;

// task 1

public class Student {
    public int iDNumber;
    public String name;
    public double GPA;

    public Student(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public Student(int iDNumber, String name, double GPA) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.GPA = GPA;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setIDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "ID Number: " + iDNumber + ", Name: " + name + ", GPA: " + GPA;
    }
}


