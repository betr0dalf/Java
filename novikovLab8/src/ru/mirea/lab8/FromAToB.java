package ru.mirea.lab8;

import java.util.Scanner;

// task 3

public class FromAToB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number (A): ");
        int A = in.nextInt();
        System.out.print("Enter the second number (B): ");
        int B = in.nextInt();
        if (A < B) {
            while (A <= B){
                System.out.print(A + " ");
                A++;
            }
        }
        else {
            while (B <= A){
                System.out.print(B + " ");
                B++;
            }
        }
    }
}
