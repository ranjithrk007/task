package com.auxolabs.general.ClassConstructorInheritance;

import java.util.Scanner;

public class Floor {
        public double width;
        public double length;
        public double res;
        public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter width and height =>");
        double width = s1.nextDouble();
        double length = s1.nextDouble();
        Floor floor = new Floor(width, length);
        System.out.println(floor.getArea());
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the cost =>");
        double cost = s2.nextDouble();
        Carpet carpet = new Carpet(cost);
        System.out.println(carpet.getcost());
        Calculator calculator = new Calculator(cost, width, length);
        System.out.println("The calculated value is =>"+calculator.getTotalCost());
    }

    public double getArea() {
        double res = width * length;
        return res ;
    }
}
    class Carpet{
         private double cost;
         public Carpet(double cost){
             this.cost = cost;
         }
         public double getcost(){
             return cost;
         }

}
    class Calculator{
        public double cost;
        public double width;
        public double value;
        public double length;
        public Calculator(double cost, double width, double length){
            this.cost = cost;
            this.width = width;
            this.length = length;
        }
        public double getTotalCost(){
            return value = ((width * length)*cost);
        }
    }