package com.auxolabs.general;

import java.util.Scanner;

public class LargestPrime {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number");
        int number = s1.nextInt();
        System.out.println(getLargestPrime(number));
    }

    private static int getLargestPrime(int number) {
        int i;
        if (number > 0) {
            for (i = 2; i <= number; i++) {
                if (number % i == 0) {
                    number /= i;
                    i--;
                }
            }
            return i;
        } else {
            return -1;
        }
    }
}

