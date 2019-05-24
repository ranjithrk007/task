package com.auxolabs.general;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    private static void inputThenPrintSumAndAverage(){
        int res = 0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter how many number to calculate ->");
        int n = s1.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the number ->");
        for (int i=0;i<n;i++) {
            a[i] = s1.nextInt();
        }
           for(int i=0;i<n;i++)
                res =res+a[i];
            System.out.println(res);
        }
}
