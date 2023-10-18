package ru.mirea.lab32;

public class Drink implements Item {
    private final double cost;
    private final String name;
    private final String description;

    private double alcoholVol;

    private DrinkTypeEnum type;

    public Drink(double cost, String name, String description) {
        if (cost < 0 || name.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("Invalid arguments provided for Drink.");
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

    public double getAlcoholVol() {
        return alcoholVol;
    }

    public void setAlcoholVol(double alcoholVol) {
        this.alcoholVol = alcoholVol;
    }

    public DrinkTypeEnum getType() {
        return type;
    }

    public void setType(DrinkTypeEnum type) {
        this.type = type;
    }
}

