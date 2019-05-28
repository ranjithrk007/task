package com.auxolabs.general.ClassConstructorInheritance;

public class Rectangle {
    public double width;
    public double length;

    public Rectangle(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cubiod cubiod = new Cubiod(5, 10, 5);
        System.out.println("cubiod.width= " + cubiod.getWidth());
        System.out.println("cubiod.length= " + cubiod.getLength());
        System.out.println("cubiod.area= " + cubiod.getArea());
        System.out.println("cubiod.height= " + cubiod.getHeight());
        System.out.println("cubiod.volume= " + cubiod.getVolume());
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}
class Cubiod extends Rectangle {
    private double height;

    public Cubiod(double width, double length, double height) {
        super(width, length);
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
        return getArea() * height;
    }
}