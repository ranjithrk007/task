package com.auxolabs.general.ClassConstructorInheritance;

import java.util.Scanner;

public class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Number =>");
        double real = s1.nextDouble();
        double imaginary = s1.nextDouble();
        ComplexNumber one = new ComplexNumber(real, imaginary);
        System.out.println("Enter 2nd value =>");
        double real1 = s1.nextDouble();
        double imaginary1 = s1.nextDouble();
        ComplexNumber number = new ComplexNumber(real1, imaginary1);
        one.add(1, 1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number real= " + number.getReal());
        System.out.println("number imaginary = " + number.getImaginary());
    }

    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }
    public void add(double x, double y) {
        this.real = real + x;
        this.imaginary = imaginary + y;
    }
    public void add(ComplexNumber number) {
        this.real = real + number.real;
        this.imaginary = imaginary + number.imaginary;
    }
    public void subtract(int x, int y) {
        this.real = real - x;
        this.imaginary = imaginary - y;
    }
    private void subtract(ComplexNumber number) {
        this.real = real - number.real;
        this.imaginary = imaginary - number.imaginary;
    }
}
