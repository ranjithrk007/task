package com.auxolabs.general;

import java.util.Scanner;

public class FactorPrinter {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = s1.nextInt();
        printFactors(number);
    }
    private static void printFactors(int number){
        if (number > 0){
            for (int i = 1; i <=number;i++ ) {
                if (number % i==0){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println(-1);
        }
    }
}
