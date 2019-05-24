package com.auxolabs.general;

import java.util.Scanner;

public class PaintJob {
    public static void main(String[] args) {
        double first=0;
        double second=0;
        double third=0;
        int forth;
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the option 1.calculate bucket to buy 2.calculate bucket needed 3.calculate area");
        int option = s2.nextInt();
        if (option==1) {
            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter the number -> ");
            first = s1.nextDouble();
            second = s1.nextDouble();
            third = s1.nextDouble();
            forth = s1.nextInt();
            getBucketCount(first, second, third, forth);
        }else if (option==2) {
            Scanner s4 = new Scanner(System.in);
            System.out.println("Enter three value");
            double a =s4.nextDouble();
            double b = s4.nextDouble();
            double c = s4.nextDouble();
            getBucketCount(a, b, c);
        }else if (option==3){
            Scanner s3 = new Scanner(System.in);
            System.out.println("Enter area");
            double fifth = s3.nextDouble();
            double sixth = s3.nextDouble();
            getBucketCount(fifth, sixth);
        }

    }
    private static void getBucketCount(double first, double second, double third, int forth){
        if (first>0 && second>0 && third>0 && forth>0){
            double num = first * second;
            double num1 = third * forth;
            double num2 = num - num1;
            double num3 = num2 / third;
            int num4 = (int) Math.ceil(num3);
            System.out.println(num4);
        }else{
            System.out.println("-1");
        }
    }
    private static void getBucketCount(double a, double b, double c){
        if (a>0 && b>0 && c>0){
            double num = a * b;
            double num2 = num - c;
            double num3 = num2 / c;
            int num4 = (int) Math.ceil(num3 + 1);
            System.out.println(num4);
        }else{
            System.out.println("-1");
        }
    }
    private static void getBucketCount(double fifth, double sixth){
        if (fifth>0 && sixth>0){
            int areas = (int) Math.ceil(fifth/sixth);
            System.out.println(areas);
        }

    }

}
