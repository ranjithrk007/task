package com.auxolabs.general.ClassConstructorInheritance;

public class Circle {
    private double Circle;

    Circle(double radius) {
        this.Circle = radius;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius =" + circle.getRadius());
        System.out.println("circle.area =" + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius =>" + cylinder.getRadius());
        System.out.println("cylinder.height =>" + cylinder.getHeight());
        System.out.println("cylinder.area =>" + cylinder.getArea());
        System.out.println("cylinder.volume =>" + cylinder.getVolume());
    }

    public double getRadius() {
        return Circle;
    }

    public double getArea() {
        return Circle * Circle * 3.15;
    }
}

class Cylinder extends Circle {
    private double height;
    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return height * getArea();
    }
}