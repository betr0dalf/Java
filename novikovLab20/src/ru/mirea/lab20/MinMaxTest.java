package ru.mirea.lab20;

// task 4

public class MinMaxTest {
    public static void main(String[] args) {
        testFindMin();
        testFindMax();
    }

    public static void testFindMin() {
        Integer[] array = {1, 5, 3, 7, 2};
        MinMax<Integer> minMax = new MinMax<>(array);
        int min = minMax.findMin();
        System.out.println("Min: " + min);
    }

    public static void testFindMax() {
        Double[] array = {1.5, 2.7, 3.2, 2.5, 1.1};
        MinMax<Double> minMax = new MinMax<>(array);
        double max = minMax.findMax();
        System.out.println("Max: " + max);
    }
}
