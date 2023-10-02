package ru.mirea.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String text = "Пример правильных выражений: 25.98 USD, 34.21 EUR, 230.2 USD. Пример неправильных выражений: 44 ERR, 0.004 EU";

        // Создаем регулярное выражение для поиска цен в USD, RUB и EU
        String regex = "(\\d+\\.\\d+) (USD|RUB|EUR)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Ищем соответствия и выводим результаты
        while (matcher.find()) {
            String price = matcher.group(1);
            String currency = matcher.group(2);

            System.out.println(price + " " + currency);
        }
    }
}