package com.auxolabs.general.ClassConstructorInheritance;

import java.util.Scanner;

public class Wall {
    private double width;
    private double height;
    private Wall(double width, double height) {
        if (height < 0) {
            this.height = 0;
        } else if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
            this.height = height;
        }
    }
    private Wall() {
        System.out.println(0.0);
    }
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter value ->");
        double width = s1.nextDouble();
        double height = s1.nextDouble();
        Wall wall = new Wall(width, height);
        System.out.println("Width" + wall.getWidth());
        System.out.println("Height" + wall.getHeight());
        System.out.println("Area" + wall.getArea());
        wall.setHeight(height);
        wall.setWidth(width);
    }
    private double getWidth() {
        return width;
    }
    private void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }
    private double getHeight() {
        return height;
    }
    private void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }
    private double getArea() {
        return width * height;
    }
}
