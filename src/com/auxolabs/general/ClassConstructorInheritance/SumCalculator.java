package com.auxolabs.general.ClassConstructorInheritance;


import java.util.Scanner;

public class SumCalculator {
    private double firstNumber;
    private double secondNumber;
    private SumCalculator() {
        System.out.println("the instance of class is created ");
    }
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value you want to operate");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        sumCalculator.setFirstNumber(firstNumber);
        sumCalculator.setSecondNumber(secondNumber);
        System.out.println("the values are intialized ");
        System.out.println("the value of first Number " + sumCalculator.getFirstNumber());
        System.out.println("the value of second Number " + sumCalculator.getSecondNumber());
        System.out.println("addition " + sumCalculator.getAdditionResult());
        System.out.println("subtraction " + sumCalculator.getSubtractionResult());
        System.out.println("multiplication " + sumCalculator.getMultiplicationResult());
        System.out.println("division " + sumCalculator.getDivisionResult());
    }
    private double getFirstNumber() {
        return firstNumber;
    }
    private void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    private double getSecondNumber() {
        return secondNumber;
    }
    private void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    private double getAdditionResult() {
        return firstNumber + secondNumber;
    }
    private double getSubtractionResult() {
        return secondNumber - firstNumber;
    }
    private double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }
    private double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }
}

