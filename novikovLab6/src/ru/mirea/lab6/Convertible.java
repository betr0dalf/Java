package ru.mirea.lab6;

interface Convertible {
    double convert(double value);
}

class CelsiusToKelvinConverter implements Convertible {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}

class CelsiusToFahrenheitConverter implements Convertible {
    @Override
    public double convert(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 30.0;

        Convertible kelvinConverter = new CelsiusToKelvinConverter();
        double kelvin = kelvinConverter.convert(celsius);
        System.out.println(celsius + "°C is equal to " + kelvin + " K");

        Convertible fahrenheitConverter = new CelsiusToFahrenheitConverter();
        double fahrenheit = fahrenheitConverter.convert(celsius);
        System.out.println(celsius + "°C is equal to " + fahrenheit + " °F");
    }
}

