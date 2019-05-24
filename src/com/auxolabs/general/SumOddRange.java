package com.auxolabs.general;

import java.util.Scanner;

public class SumOddRange {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number - ");
        int start = s1.nextInt();
        int end = s1.nextInt();
        sumOdd(start, end);
    }

    private static void sumOdd(int start, int end) {
        int sum = 0;
        if (start < 0) {
            System.out.println(-1);
        } else {


            for (int number = start; number <= end; number++) {
                int num = (isOdd(number));
                sum = num + sum;
            }
            System.out.println(sum);
        }
    }

    private static int isOdd(int number) {
        if (number < 0) {
            return 0;
        } else if (number % 2 != 0) {
            return number;
        } else {
            return 0;
        }
    }

}
