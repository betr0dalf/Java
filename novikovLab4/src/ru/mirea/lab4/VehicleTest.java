package ru.mirea.lab4;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car(4, 100.0, 500.0, 10.0, 2.5);
        Plane plane = new Plane(150, 5000.0, 5, 200.0);
        Train train = new Train(200, 1000.0, 8, 50.0);
        Ship ship = new Ship(300, 2000.0, 10, 100.0);

        System.out.println("Car:");
        System.out.println("Time: " + car.calculateTime() + " hours");
        System.out.println("Cost: $" + car.calculateCost());
        System.out.println();

        System.out.println("Plane:");
        System.out.println("Time: " + plane.calculateTime() + " hours");
        System.out.println("Cost: $" + plane.calculateCost());
        System.out.println();

        System.out.println("Train:");
        System.out.println("Time: " + train.calculateTime() + " hours");
        System.out.println("Cost: $" + train.calculateCost());
        System.out.println();

        System.out.println("Ship:");
        System.out.println("Time: " + ship.calculateTime() + " hours");
        System.out.println("Cost: $" + ship.calculateCost());
        System.out.println();
    }
}
