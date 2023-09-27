package ru.mirea.lab6;

// tasks 6-9

public class PrintableTest {
    public static void main(String[] args) {
        Printable[] printableArray = new Printable[3];

        printableArray[0] = new Book("Title 1", "Author 1");
        printableArray[1] = new Book("Title 2", "Author 2");
        printableArray[2] = new Shop("Shop 1", "Location 1");

        for (Printable printable : printableArray) {
            printable.print();
        }
    }
}
