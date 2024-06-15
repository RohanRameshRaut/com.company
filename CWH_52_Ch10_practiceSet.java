package com.company;


class Circle01{
    public int radius;

    Circle01(){
        System.out.println("This is circle01 default constructor.");
    }
    Circle01(int r){
        System.out.println("I am circle01 parameterised constructor.");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder01 extends Circle01{
    public int height;

    Cylinder01(int r, int h){
        super(r); // will call the superClass's parameterised constructor by ignoring the default constructor.
        System.out.println("I am cylinder01 parameterised constructor.");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
}


public class CWH_52_Ch10_practiceSet {
    public static void main(String[] args) {
//        Problem01
//        Cylinder01 obj = new Cylinder01(12, 4);

        // Problem02
//        * Create a class Rectangle and use inheritance to create another class Cuboid. Try to keep it as close to real world Scenario as possible(similar to the problem01).

        // Problem03
//        Create a methods for area and Volume in Problem01, which is already solved.

        // Problem04
//        Create Methods for area and volume in problem02 also create getters and setters.

        // Problem05
//        theory question: what is the order of constructor execution for the following inheritance hierarchy
        /*
        * Base-->Derived1-->Derived2
        * Derived2 obj = new Derived2();
        * Which Constructor(s) will be executed and in what order?
        * ans: Base-->Derived1-->Derived2
        *
        * */


    }
}
