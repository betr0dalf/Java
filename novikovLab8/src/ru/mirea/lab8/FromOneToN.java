package ru.mirea.lab8;

import java.util.Scanner;

// task 2

public class FromOneToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.print(i + " ");
        }
    }
}
