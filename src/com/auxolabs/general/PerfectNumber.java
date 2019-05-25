package com.auxolabs.general;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number -> ");
        int number = s1.nextInt();
        isPerfectNumber(number);
    }

    private static void isPerfectNumber(int number) {
        int sum = 0;
        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) sum = sum + i;
            }
            if (number == sum) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }
}
