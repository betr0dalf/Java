package ru.mirea.lab12;

// task 2 test

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ShapeTest extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int MAX_SIZE = 80;
    private static final int MIN_SIZE = 20;
    private static final int NUM_SHAPES = 20;

    private Random random;

    private Shape[] shapes;

    public ShapeTest() {
        setTitle("Random Shapes");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        random = new Random();
        shapes = new Shape[NUM_SHAPES];
        generateShapes();

        setVisible(true);
    }

    private void generateShapes() {
        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int size = random.nextInt(MAX_SIZE - MIN_SIZE + 1) + MIN_SIZE;
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (i % 2 == 0) {
                shapes[i] = new Circle(color, x, y, size / 2);
            } else {
                shapes[i] = new Rectangle(color, x, y, size, size);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < NUM_SHAPES; i++) {
            shapes[i].draw(g);
        }
    }
    public static void main(String[] args) {
        new ShapeTest();
    }
}
