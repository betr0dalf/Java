package ru.mirea.lab4;

// task 4.10

abstract class Vehicle {
    protected int numPassengers;
    protected double cargoWeight;

    public Vehicle(int numPassengers, double cargoWeight) {
        this.numPassengers = numPassengers;
        this.cargoWeight = cargoWeight;
    }

    public abstract double calculateTime();

    public abstract double calculateCost();
}

class Car extends Vehicle {
    private double distance;
    private double fuelEfficiency;
    private double fuelCostPerLiter;

    public Car(int numPassengers, double cargoWeight, double distance, double fuelEfficiency, double fuelCostPerLiter) {
        super(numPassengers, cargoWeight);
        this.distance = distance;
        this.fuelEfficiency = fuelEfficiency;
        this.fuelCostPerLiter = fuelCostPerLiter;
    }

    public double calculateTime() {
        // let's think that average car speed is 60 km/h
        return distance / 60.0;
    }

    public double calculateCost() {
        double fuelConsumption = distance / fuelEfficiency;
        return fuelConsumption * fuelCostPerLiter;
    }
}

class Plane extends Vehicle {
    private int flightDuration;
    private double ticketPrice;

    public Plane(int numPassengers, double cargoWeight, int flightDuration, double ticketPrice) {
        super(numPassengers, cargoWeight);
        this.flightDuration = flightDuration;
        this.ticketPrice = ticketPrice;
    }

    public double calculateTime() {
        return flightDuration;
    }

    public double calculateCost() {
        return (numPassengers * ticketPrice) + (cargoWeight * 0.5);
    }
}

class Train extends Vehicle {
    private int travelDuration;
    private double ticketPrice;

    public Train(int numPassengers, double cargoWeight, int travelDuration, double ticketPrice) {
        super(numPassengers, cargoWeight);
        this.travelDuration = travelDuration;
        this.ticketPrice = ticketPrice;
    }

    public double calculateTime() {
        return travelDuration;
    }

    public double calculateCost() {
        return (numPassengers * ticketPrice) + (cargoWeight * 0.25);
    }
}

class Ship extends Vehicle {
    private int travelDuration;
    private double ticketPrice;

    public Ship(int numPassengers, double cargoWeight, int travelDuration, double ticketPrice) {
        super(numPassengers, cargoWeight);
        this.travelDuration = travelDuration;
        this.ticketPrice = ticketPrice;
    }

    public double calculateTime() {
        return travelDuration;
    }

    public double calculateCost() {
        return (numPassengers * ticketPrice) + (cargoWeight * 0.1);
    }
}
