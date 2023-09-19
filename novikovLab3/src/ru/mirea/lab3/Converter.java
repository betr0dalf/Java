package ru.mirea.lab3;

// last task 1 currency converter

public class Converter {
    private double rubToUsdRate;
    private double rubToEurRate;

    public Converter(double rubToUsdRate, double rubToEurRate) {
        this.rubToUsdRate = rubToUsdRate;
        this.rubToEurRate = rubToEurRate;
    }

    public double convertRubToUsd(double amountInRub) {
        return amountInRub * rubToUsdRate;
    }

    public double convertRubToEur(double amountInRub) {
        return amountInRub * rubToEurRate;
    }

    public double convertUsdToRub(double amountInUsd) {
        return amountInUsd / rubToUsdRate;
    }

    public double convertEurToRub(double amountInEur) {
        return amountInEur / rubToEurRate;
    }

    public double convertUsdToEur(double amountInUsd) {
        return amountInUsd * (rubToEurRate / rubToUsdRate);
    }

    public double convertEurToUsd(double amountInEur) {
        return amountInEur * (rubToUsdRate / rubToEurRate);
    }
}
