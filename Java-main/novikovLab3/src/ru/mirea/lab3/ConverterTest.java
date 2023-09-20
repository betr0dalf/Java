package ru.mirea.lab3;

import java.util.Locale;

public class ConverterTest {
    public static void main(String[] args) {
        double rubToUsdRate = 0.0100;  // 1 RUB = 0.0100 USD
        double rubToEurRate = 0.0097;  // 1 RUB = 0.0097 EUR
        Converter converter = new Converter(rubToUsdRate, rubToEurRate);

        double amountInRub = 1000.00;
        double amountInUsd = converter.convertRubToUsd(amountInRub);
        double amountInEur = converter.convertRubToEur(amountInRub);

        System.out.print(amountInRub + " RUB is equal to ");
        System.out.printf(Locale.US, "%.2f", amountInUsd);
        System.out.print(" USD\n");
        System.out.print(amountInRub + " RUB is equal to ");
        System.out.printf(Locale.US, "%.2f", amountInEur);
        System.out.print(" EUR\n");

        double amountInUsd2 = 50.00;
        double amountInRub2 = converter.convertUsdToRub(amountInUsd2);

        System.out.print(amountInUsd2 + " USD is equal to ");
        System.out.printf(Locale.US, "%.2f", amountInRub2);
        System.out.print(" RUB\n");

        double amountInEur2 = 25.00;
        double amountInUsd3 = converter.convertEurToUsd(amountInEur2);

        System.out.print(amountInEur2 + " EUR is equal to ");
        System.out.printf(Locale.US, "%.2f", amountInUsd3 );
        System.out.print(" USD\n");
    }
}
