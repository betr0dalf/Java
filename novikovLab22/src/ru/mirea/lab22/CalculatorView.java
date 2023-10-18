package ru.mirea.lab22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorView implements ActionListener{
    static JFrame frame;
    static JLabel result;

    public void show() {
        frame = new JFrame("TestCalculator");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);

        result = new JLabel("0");
        result.setFont(new Font("Times New Roman", Font.PLAIN, 32));
        JPanel main = new JPanel();
        JPanel panelButtons = new JPanel();
        JPanel panelResult = new JPanel();


        String[] op = {"/", "*", "-"};
        String[] downRow = {"0", ".", "=", "+"};

        int ind = 0;
        for (int i = 7; i >= 1; i -= 3) {
            for (int j = i; j <= i + 2; ++j) {
                JButton jButton = new JButton(Integer.toString(j));
                jButton.addActionListener(this);
                panelButtons.add(jButton);
                if (j == i + 2) {
                    jButton = new JButton(op[ind++]);
                    jButton.addActionListener(this);
                    panelButtons.add(jButton);
                }
            }
        }

        for (String s : downRow) {
            JButton jButton = new JButton(s);
            jButton.addActionListener(this);
            panelButtons.add(jButton);
        }

        GridLayout layoutButtons = new GridLayout(4, 4);
        GridLayout layoutMain = new GridLayout(2, 1);
        panelButtons.setLayout(layoutButtons);
        panelResult.add(result);
        main.setLayout(layoutMain);
        main.add(panelResult);
        main.add(panelButtons);
        frame.add(main);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonText = e.getActionCommand();
        String resText = result.getText();
        CalculatorController.controllerFromView(buttonText, resText);
    }

    public static void viewFromController(String data){
        result.setText(data);
    }
}
