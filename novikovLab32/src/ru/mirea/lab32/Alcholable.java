package ru.mirea.lab32;

public class Alcholable extends Drink {
    public Alcholable(double cost, String name, String description) {
        super(cost, name, description);
    }

    public boolean isAlcoholicDrink(Drink drink) {
        return true;
    }

    public double getAlcoholVol(Drink drink){
        return drink.getAlcoholVol();
    }
}
