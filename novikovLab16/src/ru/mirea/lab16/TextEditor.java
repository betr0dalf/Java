package ru.mirea.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextEditor extends JFrame {
    private JTextArea textArea;

    public TextEditor() {
        setTitle("Text Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 600)); // Устанавливаем предпочтительный размер окна
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 50));
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER); // Добавляем текстовую область в основную часть окна

        JMenuBar menuBar = new JMenuBar();
        JMenu colorMenu = new JMenu("Цвет");
        JMenu fontMenu = new JMenu("Шрифт");

        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");

        blueItem.addActionListener(new ColorChangeListener(Color.BLUE));
        redItem.addActionListener(new ColorChangeListener(Color.RED));
        blackItem.addActionListener(new ColorChangeListener(Color.BLACK));

        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewItem = new JMenuItem("Courier New");

        timesNewRomanItem.addActionListener(new FontChangeListener("Times New Roman"));
        msSansSerifItem.addActionListener(new FontChangeListener("MS Sans Serif"));
        courierNewItem.addActionListener(new FontChangeListener("Courier New"));

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        fontMenu.add(timesNewRomanItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        setJMenuBar(menuBar);
        pack(); // Устанавливаем размер окна на основе предпочтительного размера и размера содержимого
        setLocationRelativeTo(null); // Центрируем окно на экране
        setVisible(true);
    }

    private class ColorChangeListener implements ActionListener {
        private Color color;

        public ColorChangeListener(Color color) {
            this.color = color;
        }

        public void actionPerformed(ActionEvent e) {
            textArea.setForeground(color);
        }
    }

    private class FontChangeListener implements ActionListener {
        private String fontName;

        public FontChangeListener(String fontName) {
            this.fontName = fontName;
        }

        public void actionPerformed(ActionEvent e) {
            Font font = textArea.getFont();
            Font newFont = new Font(fontName, font.getStyle(), font.getSize());
            textArea.setFont(newFont);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TextEditor());
    }
}