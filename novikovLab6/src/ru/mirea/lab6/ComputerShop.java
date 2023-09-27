package ru.mirea.lab6;

// task 10
import java.util.ArrayList;
import java.util.List;

enum Brand {
    Apple,
    Lenovo,
    MSI,
    Acer,
    ASUS,
    HP,
    DELL,
    Gigabyte
}

// Processor class
class Processor {
    private String model;
    private double clockSpeed;

    public Processor(String model, double clockSpeed) {
        this.model = model;
        this.clockSpeed = clockSpeed;
    }

    // Getters for model and clock speed
    public String getModel() {
        return model;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }
}

// Memory class
class Memory {
    private int capacity;
    private String type;

    public Memory(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    // Getters for capacity and type
    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }
}

// Monitor class
class Monitor {
    private String brand;
    private double size;

    public Monitor(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }

    // Getters for brand and size
    public String getBrand() {
        return brand;
    }

    public double getSize() {
        return size;
    }
}

// Computer class
class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    // Getters for brand, processor, memory, and monitor
    public Brand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
class ComputerShop {
    private List<Computer> computers;

    public ComputerShop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public List<Computer> searchComputers(Brand brand, double minClockSpeed, int minMemoryCapacity, double minMonitorSize) {
        List<Computer> foundComputers = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getBrand() == brand &&
                    computer.getProcessor().getClockSpeed() >= minClockSpeed &&
                    computer.getMemory().getCapacity() >= minMemoryCapacity &&
                    computer.getMonitor().getSize() >= minMonitorSize) {
                foundComputers.add(computer);
            }
        }
        return foundComputers;
    }
}
