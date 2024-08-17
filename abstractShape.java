package com.company;

import java.util.*;

abstract class Shape {
    float pi = 3.14f;

    abstract void area();

    abstract void volume();
}

class Cone extends Shape {
    int r, h;

    public Cone(int radius, int height) {
        this.r = radius;
        this.h = height;
    }

    void area() {
        double l = (Math.sqrt((r * r) + (h * h)));
        double result = pi * r * (r + l);
        System.out.printf("\nThe area of a cone is: %f", result);
    }

    void volume() {
        double result = (0.3333333f) * pi * (r * r) * h;
        System.out.printf("\nThe volume of a cone is: %f", result);
    }
}

class Cylinder011 extends Shape {
    int r, h;

    public Cylinder011(int radius, int height) {
        this.r = radius;
        this.h = height;
    }

    void area() {
        double result = (2 * pi * r * h) + (2 * pi * (r * r));
        System.out.printf("\nThe area of a cylinder is: %f", result);
    }

    void volume() {
        double result = pi * (r * r) * h;
        System.out.printf("\nThe volume of a cylinder is: %f", result);
    }
}

public class abstractShape {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        int radius = sc.nextInt();
        System.out.print("Enter a height: ");
        int height = sc.nextInt();

        Cone c1 = new Cone(radius, height);
        c1.area();
        c1.volume();

        Cylinder011 c2 = new Cylinder011(radius, height);
        c2.area();
        c2.volume();

    }

}

