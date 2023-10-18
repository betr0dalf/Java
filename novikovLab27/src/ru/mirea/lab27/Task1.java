package ru.mirea.lab27;

import java.util.HashSet;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        // Создаем HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Добавляем элементы в HashSet
        hashSet.add("HP");
        hashSet.add("DELL");
        hashSet.add("MSI");

        // Создаем TreeSet из HashSet
        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        // Выводим содержимое TreeSet
        for (String item : treeSet) {
            System.out.println(item);
        }
    }
}
