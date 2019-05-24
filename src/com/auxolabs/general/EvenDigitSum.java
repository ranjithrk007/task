package com.auxolabs.general;

import java.util.Scanner;

public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the digit -> ");
        int number = s1.nextInt();
        getEvenDigitSum(number);
    }

    private static void getEvenDigitSum(int number) {   // adding even digit number
        int sum = 0;
        if (number < 0) {
            System.out.println(-1);
        } else {
            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 == 0) {
                    sum = sum + digit;
                }
                number = number / 10;

            }
            System.out.println(+sum);
        }
    }
}
