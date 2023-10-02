package ru.mirea.lab12;

// task 3

import javax.swing.*;
import java.awt.*;

public class ImageDisplayGUI extends JFrame {
    public static void main(String[] args) {
        // Проверяем, что пользователь передал путь к картинке в аргументах командной строки
        if (args.length == 0) {
            System.out.println("Please specify the path to the image.");
            return;
        }

        String imagePath = args[0];

        // Создаем объект класса ImageDisplayGUI с переданным путем к картинке
        SwingUtilities.invokeLater(() -> new ImageDisplayGUI(imagePath));
    }
    private JLabel imageLabel;

    public ImageDisplayGUI(String imagePath) {
        setTitle("Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(517, 800));
        setLayout(new BorderLayout());

        // Создаем и добавляем метку для отображения картинки
        imageLabel = new JLabel();
        add(imageLabel, BorderLayout.CENTER);

        // Загружаем картинку из указанного пути
        ImageIcon imageIcon = new ImageIcon(imagePath);
        // Устанавливаем картинку в метку
        imageLabel.setIcon(imageIcon);

        pack();
        setVisible(true);
    }
}
