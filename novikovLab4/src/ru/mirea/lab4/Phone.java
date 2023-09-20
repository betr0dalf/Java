package ru.mirea.lab4;

// task 4.2

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
        this("", "", 0.0);
    }

    public void receiveCall(String callerName) {
        System.out.println("calling " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("calling " + callerName + " - " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("sending message to: " + String.join(", ", phoneNumbers));
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "iPhone 15 Pro Max Deluxe", 0.3);
        Phone phone2 = new Phone("431673571", "Samsung Galaxy S30", 0.4);
        Phone phone3 = new Phone("880055535", "Google Pixel 423", 0.35);

        System.out.println("phone 1 – number: " + phone1.getNumber() + ", model: " + phone1.model + ", weight: " + phone1.weight);
        System.out.println("phone 2 – number: " + phone2.getNumber() + ", model: " + phone2.model + ", weight: " + phone2.weight);
        System.out.println("phone 3 – number: " + phone3.getNumber() + ", model: " + phone3.model + ", weight: " + phone3.weight);

        phone1.receiveCall("John Doe");
        phone2.receiveCall("Lionel Messi");
        phone3.receiveCall("Michael Jordan");

        phone1.receiveCall("Harry Potter", "555123456");
        phone2.receiveCall("Emma Watson", "555987654");

        phone1.sendMessage("555111111", "555222222", "555333333");
        phone2.sendMessage("555444444");
        phone3.sendMessage("555555555", "555666666");
    }
}
