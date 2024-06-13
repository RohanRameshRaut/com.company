package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting x");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class CWH_45_Ch10_inheritance {
    public static void main(String[] args) {
        // Creating an object of Base class
//        Base b = new Base();
//        b.setX(4);
//        System.out.println(b.getX());

        // Creating an object of Derived class
        Derived d = new Derived();
        d.setX(5);
        d.setY(7);
        System.out.println(d.getX());
        System.out.println(d.getY());

        // Java doesn't support multiple inheritance (two class can not be super class for a subclass).
    }
}
