package com.auxolabs.general;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter two divisor numbers");
        int first = s1.nextInt();
        int second = s1.nextInt();
        getGreatestCommonDivisor(first, second);
    }

    private static void getGreatestCommonDivisor(int first, int second) {
        int gcd = 1;
        if (first > 10 && second > 10) {
            for (int i = 1; i <= first && i <= second; i++) {
                if (first % i == 0 && second % i == 0)
                    gcd = i;
            }
            System.out.println(gcd);
        } else {
            System.out.println("-1");
        }
    }
}
