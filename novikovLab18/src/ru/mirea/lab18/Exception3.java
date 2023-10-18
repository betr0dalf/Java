package ru.mirea.lab18;

import java.util.Scanner;

public class Exception3 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
//        } catch (NumberFormatException e) {
//            System.out.println("It's not an integer");
//        } catch (ArithmeticException e) {
//            System.out.println("You can't divide by 0");
//        }
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}



