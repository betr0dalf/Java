package ru.mirea.lab21;

// task 1-3

public class MyArray<T> {
    private T[] array;

    public MyArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void getElementByIndex(int index) {
        try {
            System.out.println("Поиск элемента по индексу " + index + ": " + array[index]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Error: " + e);
        }
    }
}

