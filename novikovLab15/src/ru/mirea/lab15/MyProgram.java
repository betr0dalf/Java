package ru.mirea.lab15;

import java.awt.*;
import java.awt.event.*;

/*public class MyProgram extends Frame {
    private TextField textField;
    private Button leftButton;
    private Button rightButton;

    public MyProgram() {
        // Create the window
        setTitle("My Program");
        setSize(400, 300);
        setLayout(new BorderLayout());

        // Create the menu
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");

        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem cutItem = new MenuItem("Cut");
        MenuItem pasteItem = new MenuItem("Paste");
        MenuItem helpItem = new MenuItem("Help");

        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);
        helpMenu.add(helpItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        setMenuBar(menuBar);

        // Create the text input field
        textField = new TextField();
        add(textField, BorderLayout.CENTER);

        // Create the buttons
        leftButton = new Button("Button 1");
        rightButton = new Button("Button 2");

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(leftButton);
        buttonPanel.add(rightButton);

        add(buttonPanel, BorderLayout.NORTH);








}*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyProgram extends JFrame {
    private JTextArea textArea;
    private JButton leftButton;
    private JButton rightButton;

    public MyProgram() {
        // Create the window
        setTitle("My Program");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the content pane
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        setContentPane(contentPane);

        // Create the menu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem pasteItem = new JMenuItem("Paste");
        JMenuItem helpItem = new JMenuItem("Help!!!");

        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);
        helpMenu.add(helpItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        // Create the text area
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        // Cоздаем кнопки
        leftButton = new JButton("Button 1");
        rightButton = new JButton("Button 2");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        buttonPanel.add(leftButton);
        buttonPanel.add(rightButton);

        contentPane.add(buttonPanel, BorderLayout.NORTH);

        // Обработчики событий
        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                // Сохранение текста в файл или выполнение любой друглй операции сохранения
                System.out.println("Saving text: " + text);
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        copyItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                // Копирует текст в буфер обмена или выполняет любую другую операцию копирования
                System.out.println("Copying text: " + text);
            }
        });

        cutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                // Вырезает текст из текстового поля или выполняет любую другую операцию вырезания
                System.out.println("Cutting text: " + text);
                textArea.setText(""); // Очищает поле после вырезания
            }
        });

        pasteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Извлекает текст из буфера обмена или выполняет любую другую операцию вставки
                String clipboardText = "Pasted Text";
                textArea.setText(clipboardText);
                System.out.println("Pasting text: " + clipboardText);
            }
        });

        helpItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("No one can help this program...");
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyProgram();
    }
}
