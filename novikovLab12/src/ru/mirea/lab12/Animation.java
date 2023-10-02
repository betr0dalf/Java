package ru.mirea.lab12;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;

public class Animation extends JFrame {
    private JPanel animationPanel;
    private Timer animationTimer;
    private int currentFrame = 0;
    private BufferedImage[] frames;

    public Animation() {
        // Установка размеров окна
        setSize(720, 480);
        setTitle("Animation");
        // Завершение работы при закрытии окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Создание панели для анимации
        animationPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Отрисовка текущего кадра анимации
                if (frames != null) {
                    g.drawImage(frames[currentFrame], 0, 0, null);
                }
            }
        };
        // Добавление панели на окно
        add(animationPanel);
        // Загрузка последовательности кадров изображения
        loadFrames("X:/MIREA_3/Java/Labs/novikovLab5/src/ru/mirea/lab5/frames");
        // Создание таймера для обновления кадров анимации
        animationTimer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Увеличение номера текущего кадра
                currentFrame = (currentFrame + 1) % frames.length;
                // Перерисовка панели для отображения нового кадра
                animationPanel.repaint();
            }
        });
    }

    private void loadFrames(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        if (files != null) {
            int numFrames = files.length;
            frames = new BufferedImage[numFrames];
            for (int i = 0; i < numFrames; i++) {
                File file = files[i];
                if (file.isFile()) {
                    try {
                        BufferedImage image = ImageIO.read(file);
                        frames[i] = image;
                    } catch (IOException e) {
                        // Обработка ошибки при загрузке изображения
                        e.printStackTrace();
                    }
                }
            }
        } else {
            // Обработка ошибки отсутствия файлов в папке
            System.err.println("Error: no frames in directory");
        }
    }

    public void startAnimation() {
        // Запуск таймера анимации
        animationTimer.start();
    }

    public static void main(String[] args) {
        // Создание и отображение окна анимации
        Animation animation = new Animation();
        animation.setVisible(true);
        // Запуск анимации
        animation.startAnimation();
    }
}
