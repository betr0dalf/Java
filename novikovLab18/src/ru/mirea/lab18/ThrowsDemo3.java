package ru.mirea.lab18;

import java.util.Scanner;

public class ThrowsDemo3 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public void printDetails(String key) {
        boolean isValidKey = false;
        while (!isValidKey) {
            try {
                String message = getDetails(key);
                System.out.println(message);
                isValidKey = true;
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
                System.out.println("Enter key again:");
                Scanner myScanner = new Scanner(System.in);
                key = myScanner.next();
            }
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
