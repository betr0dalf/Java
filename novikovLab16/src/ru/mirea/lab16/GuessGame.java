package ru.mirea.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuessGame extends JFrame {
    private JTextField textField;
    private JButton guessButton;
    private int targetNumber;
    private int remainingGuesses;

    public GuessGame() {
        setTitle("Guessing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(500, 300);

        JLabel welcomeLabel = new JLabel("Welcome to the Guessing Game");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(welcomeLabel, BorderLayout.NORTH);

        JPanel inputPanel = new JPanel();
        textField = new JTextField(10);
        textField.setFont(new Font("Arial", Font.PLAIN, 18));
        guessButton = new JButton("Guess");
        guessButton.addActionListener(new GuessButtonListener());
        guessButton.setFont(new Font("Arial", Font.BOLD, 18));
        inputPanel.add(textField);
        inputPanel.add(guessButton);
        add(inputPanel, BorderLayout.CENTER);

        JLabel infoLabel = new JLabel("You have 3 attempts to guess the number between 0 and 20.");
        infoLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        add(infoLabel, BorderLayout.SOUTH);

        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.GREEN);
        westPanel.setPreferredSize(new Dimension(100, 100));
        westPanel.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(GuessGame.this, "Welcome to ZAO", "Zone Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        add(westPanel, BorderLayout.WEST);

        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.YELLOW);
        eastPanel.setPreferredSize(new Dimension(100, 100));
        eastPanel.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(GuessGame.this, "Welcome to VAO", "Zone Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        add(eastPanel, BorderLayout.EAST);

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.CYAN);
        southPanel.setPreferredSize(new Dimension(100, 100));
        southPanel.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(GuessGame.this, "Welcome to YUAO", "Zone Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        add(southPanel, BorderLayout.SOUTH);

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.MAGENTA);
        northPanel.setPreferredSize(new Dimension(100, 100));
        northPanel.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(GuessGame.this, "Welcome to SAO", "Zone Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        add(northPanel, BorderLayout.NORTH);

        setLocationRelativeTo(null);
        pack();
        setVisible(true);

        targetNumber = (int) (Math.random() * 21);
        remainingGuesses = 3;
    }

    private class GuessButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String guessText = textField.getText();
            int guessNumber = Integer.parseInt(guessText);

            if (guessNumber == targetNumber) {
                JOptionPane.showMessageDialog(GuessGame.this, "Congratulations! You guessed the number!",
                        "Success", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else {
                remainingGuesses--;

                if (remainingGuesses == 0) {
                    JOptionPane.showMessageDialog(GuessGame.this, "You have used all your attempts. The target number was " + targetNumber + ".",
                            "Game Over", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                } else if (guessNumber > targetNumber) {
                    JOptionPane.showMessageDialog(GuessGame.this, "Wrong guess! The target number is smaller. You have " + remainingGuesses + " attempts left.",
                            "Wrong Guess", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(GuessGame.this, "Wrong guess! The target number is larger. You have " + remainingGuesses + " attempts left.",
                            "Wrong Guess", JOptionPane.WARNING_MESSAGE);
                }

                textField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GuessGame());
    }
}
