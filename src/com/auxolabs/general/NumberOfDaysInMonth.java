package com.auxolabs.general;

import java.util.Scanner;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        Scanner s2 = new Scanner(System.in);
        System.out.println("1 . Enter the year 2 . Enter month and year");
        int option = s2.nextInt();

        if (option == 1) {

            boolean shouldExit = false;
            while (!shouldExit) {
                Scanner s1 = new Scanner(System.in);
                System.out.println("Enter the year");
                int year = s1.nextInt();
                isLeapYear(year);
                if (year == 0) {
                    shouldExit = true;
                }
            }
        }if (option == 2) {
            Scanner s3 = new Scanner(System.in);
            System.out.println("Enter the month and year");
            int month = s3.nextInt();
            int years = s3.nextInt();



            getDaysInMonth(month, years);
        }
    }
    private static void isLeapYear(int year) {
        if ((year % 4 == 0)) {
            if ((year % 100 == 0)) {
                if (year % 400 != 0) {
                    System.out.println("false");
                    return;
                }
            }
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static boolean wasLeapYear(int years) {
        if ((years % 4 == 0)) {
            if ((years % 100 == 0)) {
                if (years % 400 != 0) {
                    return false;
                }
            }

            return true;
        } else {
            return false;
        }
    }

    private static void getDaysInMonth(int month , int years) {
        if (month > 0 && month <12) {


            if ((month == 2)) {

                if (wasLeapYear(years)){
                    System.out.println("29");
                }else{
                    System.out.println("28");
                }
            } else if (month % 2 != 0) {
                System.out.println("31 days");
            } else {
                System.out.println("30 days");
            }
        }else{
            System.out.println(-1);
        }
    }
}