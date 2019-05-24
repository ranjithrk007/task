package com.auxolabs.general;

import java.util.Scanner;

public class LastDigitChecker {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("1. Enter single number 2. Enter three number");
        int option = s1.nextInt();
        if (option == 1) {
            Scanner s2 = new Scanner(System.in);
            System.out.println("Enter number");
            int number = s2.nextInt();
            isValid(number);
        } else if (option == 2) {
            Scanner s3 = new Scanner(System.in);
            System.out.println("Enter three number");
            int number1 = s3.nextInt();
            int number2 = s3.nextInt();
            int number3 = s3.nextInt();
            hasSameLastDigit(number1, number2, number3);
        } else {
            System.out.println("Enter valid number");
        }
    }

    private static void isValid(int number) {    //method for checking valid number
        if (number >= 10 && number <= 1000) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static void hasSameLastDigit(int number1, int number2, int number3) {    // method for checking same number in last digit
        if ((number1 > 10 && number1 < 999) && (number2 > 10 && number2 < 999) && (number3 > 10 && number3 < 999)) {
            int lastnum1 = number1 % 10;
            int lastnum2 = number2 % 10;
            int lastnum3 = number3 % 10;
            if ((lastnum1 == lastnum2) || (lastnum1 == lastnum3) || (lastnum3 == lastnum2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }
}
