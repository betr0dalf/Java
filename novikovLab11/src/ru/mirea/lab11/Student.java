package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Date;

// task 3
public class Student {
    private String name;
    private String surname;
    private String specialization;
    private int year;
    private String group;
    private double averageGPU;
    private Date dateOfBirth;

    public Student(String name, String surname, String specialization, int year, String group, double averageGPU, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.year = year;
        this.group = group;
        this.averageGPU = averageGPU;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public double getAverageGPU() {
        return averageGPU;
    }

    public void setAverageGPU(double averageGPU) {
        this.averageGPU = averageGPU;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFormattedDateOfBirth(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(dateOfBirth);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialization='" + specialization + '\'' +
                ", year=" + year +
                ", group='" + group + '\'' +
                ", averageGPU=" + averageGPU +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
