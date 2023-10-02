package ru.mirea.lab13;

// task 5 + 25%

public class PhoneNumberFormatter {
    public static String formatPhoneNumber(String phoneNumber) {
        // Check the format in which the number is presented
        if (phoneNumber.startsWith("8")) {
            // If the number is in Russian format, then we will convert it
            return "+7" + phoneNumber.substring(1, 4) + '-' +
                    phoneNumber.substring(4, 7) + '-' +
                    phoneNumber.substring(7);
        } else if (phoneNumber.startsWith("+") &&  phoneNumber.length() == 12) {
            return phoneNumber.substring(0, 5) + '-' +
                    phoneNumber.substring(5, 8) + '-' +
                    phoneNumber.substring(8);
        } else if(phoneNumber.startsWith("+") &&  phoneNumber.length() == 13) {
            // If the number is in international format, then convert it
            return phoneNumber.substring(0, 6) + "-" +
                    phoneNumber.substring(6, 9) + "-" +
                    phoneNumber.substring(9);
        } else {
            // If the number format is unsupported, we will return the original string
            return phoneNumber;
        }
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";

        String formattedPhoneNumber1 = formatPhoneNumber(phoneNumber1);
        String formattedPhoneNumber2 = formatPhoneNumber(phoneNumber2);
        String formattedPhoneNumber3 = formatPhoneNumber(phoneNumber3);

        System.out.println("Number 1: " + phoneNumber1 + "\tFormatted number 1: " + formattedPhoneNumber1);
        System.out.println("Number 2: " + phoneNumber2 + "\tFormatted number 2: " + formattedPhoneNumber2);
        System.out.println("Number 3: " + phoneNumber3 + "\tFormatted number 3: " + formattedPhoneNumber3);

    }
}
