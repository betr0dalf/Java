package ru.mirea.lab21;

// task 1-3

public class ArrayTest {
    public static void main(String[] args) {
        // Создание экземпляра MyArray с типом Integer
        MyArray<Integer> intArray = new MyArray<>(new Integer[]{1, 2, 3, 4, 5});

        // Вывод элемента по индексу
        intArray.getElementByIndex(1);

        // Вывод массива
        Integer[] array = intArray.getArray();
        System.out.println("Массив целых чисел:");
        for (Integer element : array) {
            System.out.println(element);
        }

        // Создание экземпляра MyArray с типом String
        MyArray<String> stringArray = new MyArray<>(new String[]{"Привет", "Мир"});

        // Вывод элемента по индексу
        stringArray.getElementByIndex(1);
        stringArray.getElementByIndex(9);

        // Вывод массива
        String[] newStringArray = stringArray.getArray();
        System.out.println("Массив строк:");
        for (String element : newStringArray) {
            System.out.println(element);
        }
    }
}
