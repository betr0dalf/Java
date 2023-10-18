package ru.mirea.lab27;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        // Создаем Map<String, String>
        Map<String, String> map = createMap(); // создаем и заполняем map

        // Подсчитываем количество людей с одинаковыми именами
        int sameFirstNameCount = getSameFirstNameCount(map);

        // Подсчитываем количество людей с одинаковыми фамилиями
        int sameLastNameCount = getSameLastNameCount(map);

        // Выводим результаты
        System.out.println("Количество людей с одинаковыми именами: " + sameFirstNameCount);
        System.out.println("Количество людей с одинаковыми фамилиями: " + sameLastNameCount); // Их будет 0, так как в HashMap не может быть одинаковых ключей
    }

    public static Map<String, String> createMap() {
        // Создаем и заполняем HashMap
        Map<String, String> map = new HashMap<>();
        map.put("Булгаков", "Иван");
        map.put("Петров", "Петр");
        map.put("Иванов", "Иван");
        map.put("Староухов", "Игнат");
        map.put("Ларин", "Максим");
        map.put("Ким", "Александр");
        map.put("Федосов", "Сергей");
        map.put("Рамазанов", "Дамир");
        map.put("Препелица", "Петр");
        map.put("Новиков", "Денис");

        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
        // Создаем HashMap для подсчета количества людей с одинаковыми именами
        Map<String, Integer> firstNameCountMap = new HashMap<>();

        // Подсчитываем количество людей с одинаковыми именами
        for (String firstName : map.values()) {
            if (firstNameCountMap.containsKey(firstName)) {
                int count = firstNameCountMap.get(firstName);
                firstNameCountMap.put(firstName, count + 1);
            } else {
                firstNameCountMap.put(firstName, 1);
            }
        }

        // Возвращаем общее количество людей с одинаковыми именами
        int sameFirstNameCount = 0;
        for (int count : firstNameCountMap.values()) {
            if (count > 1) {
                sameFirstNameCount += count;
            }
        }

        return sameFirstNameCount;
    }

    public static int getSameLastNameCount(Map<String, String> map) {
        // Создаем HashMap для подсчета количества людей с одинаковыми фамилиями
        Map<String, Integer> lastNameCountMap = new HashMap<>();

        // Подсчитываем количество людей с одинаковыми фамилиями
        for (String lastName : map.keySet()) {
            if (lastNameCountMap.containsKey(lastName)) {
                int count = lastNameCountMap.get(lastName);
                lastNameCountMap.put(lastName, count + 1);
            } else {
                lastNameCountMap.put(lastName, 1);
            }
        }

        // Возвращаем общее количество людей с одинаковыми фамилиями
        int sameLastNameCount = 0;
        for (int count : lastNameCountMap.values()) {
            if (count > 1) {
                sameLastNameCount += count;
            }
        }

        return sameLastNameCount;
    }
}
