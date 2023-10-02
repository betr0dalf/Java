package ru.mirea.lab13;

// task 2 + 5%

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder(lastName);

        if (firstName != null && firstName.length() > 0) {
            fullName.append(" ").append(firstName.charAt(0)).append('.');
        }

        if (middleName != null && middleName.length() > 0) {
            fullName.append(" ").append(middleName.charAt(0)).append('.');
        }

        return fullName.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Downey", "Robert", "Junior");
        Person person2 = new Person("Freeman", "Morgan", null);
        Person person3 = new Person("Potter", null, "Abraham");

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
    }
}
