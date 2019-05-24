package com.auxolabs.general;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = s1.nextInt();
        numberToWords(number);
    }
    private static void numberToWords(int number){
        int reversedValue = reverse(number);
        System.out.println("the reversed value  is " + reversedValue);
        System.out.println("the length of digit " + getDigitCount(number));

        if (isValid(reversedValue)) {
            String Numbers[] = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
            String numberStr = String.valueOf(number);
            for (int i = 0; i < numberStr.length(); i++) {

                System.out.println(Numbers[Integer.parseInt(String.valueOf(numberStr.charAt(i)))]);
            }

        } else {
            System.out.println("Invalid Value");
        }
    }
    private static int getDigitCount(int number) {
        if (number >= 0) {
            return String.valueOf(number).length();
        }
        return -1;
    }

    private static int reverse(int number) {
        int returnValue = 0, negative = 0;
        if (number < 0) {
            negative = 1;
            number = number * -1;
        }
        while (number != 0) {
            returnValue *= 10;
            returnValue += number % 10;
            number /= 10;

        }
        return negative == 0 ? returnValue : returnValue * -1;
    }

    private static boolean isValid(int number) {
        if (number >= 0) {
            return true;
        }
        return false;
    }
}
