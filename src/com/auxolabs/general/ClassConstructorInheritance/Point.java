package com.auxolabs.general.ClassConstructorInheritance;
import java.util.Scanner;

public class Point {
    int x;
    int y;
    private int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    Point() {
    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    private double distance() {
        return Math.sqrt(((this.x - 0) * (this.x - 0)) + ((this.y - 0)  *(this.y - 0)));
    }

    private double distance(int x, int y) {
        return Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));
    }

    private double distance(Point point) {
        return Math.sqrt(((this.x - point.x) *(this.x - point.x)) + ((this.y - point.y) * (this.y - point.y)));
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter points");
        int x = s1.nextInt();
        int y = s1.nextInt();
        Point point = new Point(x, y);
        System.out.println("Distance =" + point.distance());
        System.out.println("Enter another point");
        int dis_x = s1.nextInt();
        int dis_y = s1.nextInt();
        System.out.println("Distance between points =" + point.distance(dis_x, dis_y));
        System.out.println("Enter last point");
        int p_x = s1.nextInt();
        int p_y = s1.nextInt();
        Point sec = new Point(p_x, p_y);
        System.out.println("Distance between point =" + point.distance(sec));
    }
}