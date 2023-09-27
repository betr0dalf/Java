package ru.mirea.lab6;

// tasks 6-9

public interface Printable {
    void print();
}

class Book implements Printable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Shop implements Printable {
    private String name;
    private String location;

    public Shop(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public void print() {
        System.out.println("Shop: " + name + " located at " + location);
    }
}

