package com.company;

import javax.swing.*;

class Base01{
    Base01(){
        System.out.println("I am a Base class Constructor");
    }
    Base01(int x){
        System.out.println("I am an overloaded Constructor with value of x: "+ x);
    }
}

class Derived01 extends Base01{
    Derived01(){
//        super(0); //  by default the base class's default constructor will run(no parameters wala), to run the parameterised constructor we use super(parameter) keyword.
        System.out.println("I am a derived class Constructor");
    }
    Derived01(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y: "+ y);
    }
}

class ChildOfDerived extends Derived01{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of chile of derived with value of z: "+ z);
    }

}
public class CWH_46_constructors_in_inheritance {
    public static void main(String[] args) {
//        Base01 b = new Base01();
//        Derived01 d = new Derived01();
//        Derived01 d = new Derived01(14, 9);
//        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);

    }
}
