package ru.mirea.lab32;

public class MenuItem extends Dish {
    private int cost;
    private String name;
    private String description;

    public MenuItem(double cost, String name, String description) {
        super(cost, name, description);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
