package ru.mirea.lab30;

public class Dish implements Item {
    private final double cost;
    private final String name;
    private final String description;

    public Dish(double cost, String name, String description) {
        if (cost < 0 || name.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("Invalid arguments provided for Dish.");
        }
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
