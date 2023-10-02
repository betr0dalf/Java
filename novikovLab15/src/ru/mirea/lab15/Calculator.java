package ru.mirea.lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class Calculator extends JFrame {
    private JTextField textField;
    private double firstNumber;
    private String operator;

    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(400, 500); // Set the size of the window

        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.BOLD, 24)); // Increase the font size

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10)); // Increase the gap between buttons

        String[] buttonLabels = {"7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"};

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            button.setFont(new Font("Arial", Font.PLAIN, 24)); // Increase the font size of the buttons
            buttonPanel.add(button);
        }

        add(textField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String buttonLabel = ((JButton) e.getSource()).getText();
            switch (buttonLabel) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case ".":
                    textField.setText(textField.getText() + buttonLabel);
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    firstNumber = Double.parseDouble(textField.getText());
                    operator = buttonLabel;
                    textField.setText("");
                    break;
                case "=":
                    double secondNumber = Double.parseDouble(textField.getText());
                    double result = calculate(firstNumber, secondNumber, operator);
                    textField.setText(String.valueOf(result));
                    break;
                default:
                    break;
            }
        }

        private double calculate(double firstNumber, double secondNumber, String operator) {
            switch (operator) {
                case "+":
                    return firstNumber + secondNumber;
                case "-":
                    return firstNumber - secondNumber;
                case "*":
                    return firstNumber * secondNumber;
                case "/":
                    if (secondNumber != 0) {
                        return firstNumber / secondNumber;
                    } else {
                        JOptionPane.showMessageDialog(Calculator.this, "Cannot divide by zero",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        return 0;
                    }
                default:
                    return 0;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator());
    }
}