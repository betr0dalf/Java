package ru.mirea.lab6;

// task 10

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ComputerStoreTest {
    public static void main(String[] args) {
        ComputerShop shop = new ComputerShop();
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        // Input and add computers to the store
        System.out.print("Enter the number of computers to add to the store: ");
        int numComputers = in.nextInt();
        in.nextLine(); // Consume the newline character

        for (int i = 0; i < numComputers; i++) {
            System.out.println("\nComputer " + (i+1) + ":");

            System.out.print("Brand (Apple, Lenovo, MSI, Acer, ASUS, HP, DELL, Gigabyte): ");
            Brand brand = Brand.valueOf(in.nextLine());

            System.out.print("Processor Model: ");
            String processorModel = in.nextLine();
            System.out.print("Processor Clock Speed: ");
            double clockSpeed = in.nextDouble();
            in.nextLine(); // Consume the newline character
            Processor processor = new Processor(processorModel, clockSpeed);

            System.out.print("Memory Capacity (GB): ");
            int capacity = in.nextInt();
            in.nextLine(); // Consume the newline character
            System.out.print("Memory Type: ");
            String type = in.nextLine();
            Memory memory = new Memory(capacity, type);

            System.out.print("Monitor Brand: ");
            String monitorBrand = in.nextLine();
            System.out.print("Monitor Size (inches): ");
            double size = in.nextDouble();
            in.nextLine(); // Consume the newline character
            Monitor monitor = new Monitor(monitorBrand, size);

            Computer computer = new Computer(brand, processor, memory, monitor);
            shop.addComputer(computer);

            System.out.println("\nComputer added to store.");
        }

        // Search for computers in the store
        System.out.println("\nSearch for computers:");
        System.out.print("Brand: ");
        Brand searchBrand = Brand.valueOf(in.nextLine());
        System.out.print("Minimum Processor Clock Speed: ");
        double minClockSpeed = in.nextDouble();
        System.out.print("Minimum Memory Capacity (GB): ");
        int minMemoryCapacity = in.nextInt();
        System.out.print("Minimum Monitor Size (inches): ");
        double minMonitorSize = in.nextDouble();

        List<Computer> foundComputers = shop.searchComputers(searchBrand, minClockSpeed, minMemoryCapacity, minMonitorSize);
        if (foundComputers.isEmpty()) {
            System.out.println("\nNo computers found in the store that match the criteria.");
        } else {
            System.out.println("\nComputers found in the store:");
            for (Computer computer : foundComputers) {
                System.out.println("Brand: " + computer.getBrand());
                System.out.println("Processor: " + computer.getProcessor().getModel() + " (" + computer.getProcessor().getClockSpeed() + " GHz)");
                System.out.println("Memory: " + computer.getMemory().getCapacity() + " GB " + computer.getMemory().getType());
                System.out.println("Monitor: " + computer.getMonitor().getBrand() + " (" + computer.getMonitor().getSize() + " inches)\n");
            }
        }
        in.close();
    }
}
