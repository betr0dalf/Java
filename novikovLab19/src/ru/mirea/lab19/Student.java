package ru.mirea.lab19;


public class Student {
    private String name;
    private String surname;
    private String specialization;
    private int year;
    private String group;
    private double averageGPU;

    public Student(String name, String surname, String specialization, int year, String group, double averageGPU) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.year = year;
        this.group = group;
        this.averageGPU = averageGPU;
    }

    public String getName() {
        return name;
    }

    public void setИмя(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageGPA() {
        return averageGPU;
    }

    public void setAverageGPU(double averageGPU) {
        this.averageGPU = averageGPU;
    }
}
