package com.company;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2* 3.14 * radius * radius + 2* 3.14 *radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height; // Math.PI for exact value.
    }
}

class Rectangle01{
    private int length;
    private int breadth;

    public Rectangle01(){
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle01(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class CWH_44_Ch9_practiceSet {
    public static void main(String[] args) {
        // Problem 01
//        Cylinder myCylinder = new Cylinder();
//        myCylinder.setHeight(12);
//        System.out.println(myCylinder.getHeight());
//        myCylinder.setRadius(9);
//        System.out.println(myCylinder.getRadius());

        // Problem 02
//        System.out.println(myCylinder.surfaceArea());
//        System.out.println(myCylinder.volume());

        // Problem 03
//        Cylinder myCylinder = new Cylinder(9, 12);
//        System.out.println(myCylinder.getRadius());
//        System.out.println(myCylinder.getHeight());

        // Problem 04
//        Rectangle01 r = new Rectangle01();
//        Rectangle01 r = new Rectangle01(12, 56);
//        System.out.println(r.getLength());
//        System.out.println(r.getBreadth());

        // Problem 05
        // Repeat 1 for a spare


    }
}
