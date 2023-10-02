package ru.mirea.lab15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuSelection {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Создаем массив элементов меню
        String[] menuItems = {"Australia", "China", "England", "Russia"};

        // Создаем комбо-бокс и добавляем элементы меню в него
        JComboBox<String> comboBox = new JComboBox<>(menuItems);

        // Создаем слушателя для события выбора элемента в комбо-боксе
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                // Получаем выбранный элемент из комбо-бокса
                String selectedItem = (String) comboBox.getSelectedItem();
                // Выводим выбранный элемент
                System.out.println("Selected item: " + selectedItem);
            }
        });

        // Добавляем комбо-бокс на панель содержимого фрейма
        frame.getContentPane().add(comboBox);
        frame.setVisible(true);
    }
}
