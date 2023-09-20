package ru.mirea.lab4;

// task 1

public enum Season {
    WINTER(-7.0, "snow, cold, ice"),
    SPRING(10.9, "flowers bloom, warm wind, everything turning to green"),
    SUMMER(19.2, "warm, optimism, positive energy"),
    AUTUMN(8.4, "short and cold days, everything turns brown and drab");

    private double averageTemperature;
    private String info;

    Season(double averageTemperature, String info) {
        this.averageTemperature = averageTemperature;
        this.info = info;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public String getInfo() {
        return info;
    }

    public static void getDescription(Season season) {
        if (season == SUMMER) {
            System.out.println("Warm Time of the Year\n");
        }
        else {
            System.out.println("Cold Time of the Year\n");
        }
    }

    public static void printSeasonInfo(Season season) {
        switch (season) {
            case SUMMER -> System.out.println("I love summer\n");
            case AUTUMN -> System.out.println("I love autumn\n");
            case WINTER -> System.out.println("I love winter\n");
            case SPRING -> System.out.println("I love spring\n");
        }
    }
}
