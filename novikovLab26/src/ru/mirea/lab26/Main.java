package ru.mirea.lab26;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Создаем объект HashMap
        Map<Integer, String> hashMap = new HashMap<>();

        // Добавляем элементы в хэш-таблицу
        hashMap.put(1, "Значение 1");
        hashMap.put(2, "Значение 2");
        hashMap.put(3, "Значение 3");
        hashMap.put(4, "Значение 4");
        hashMap.put(5, "Значение 5");
        hashMap.put(6, "Значение 6");
        hashMap.put(7, "Значение 7");
        hashMap.put(8, "Значение 8");
        hashMap.put(9, "Значение 9");
        hashMap.put(10, "Значение 10");

        // Демонстрация поиска элемента по ключу
        int keyToFind = 7;
        if (hashMap.containsKey(keyToFind)) {
            String value = hashMap.get(keyToFind);
            System.out.println("Найдено значение по ключу " + keyToFind + ": " + value);
        } else {
            System.out.println("Значение с ключом " + keyToFind + " не найдено");
        }

        // Демонстрация удаления элемента по ключу
        int keyToRemove = 2;
        if (hashMap.containsKey(keyToRemove)) {
            String removedValue = hashMap.remove(keyToRemove);
            System.out.println("Удалено значение по ключу " + keyToRemove + ": " + removedValue);
        } else {
            System.out.println("Значение с ключом " + keyToRemove + " не найдено");
        }
    }
}
