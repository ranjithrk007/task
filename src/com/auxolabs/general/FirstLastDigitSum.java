package com.auxolabs.general;

import java.util.Scanner;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the digits -> ");
        int number = s1.nextInt();
        sumFirstAndLastDigit(number);
    }

    private static void sumFirstAndLastDigit(int number) {  //adding first and last number
        int lastdigit = number % 10;
        while (number >= 10) {
            number = number / 10;
        }
        System.out.println(lastdigit + number);
    }
}
