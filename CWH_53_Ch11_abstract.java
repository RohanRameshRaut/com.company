package com.company;

abstract class Parent02{ // abstract class is a stander for other class, we can't create an object of an abstract class
    // A class which contains the abstract method is called abstract class.
    public Parent02(){
        System.out.println("Mai base02 hun");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet(); // we use it in other classes, as per our customization, it is just a stander
    abstract public void greet2(); // we use it in other classes, as per our customization, it is just a stander
}
// using abstract either you can create a concrete class or an abstract class.
// concrete class
class Child02 extends Parent02{
    @Override
    public void greet(){
        System.out.println("Good morning");
    } @Override
    public void greet2(){
        System.out.println("Good morning");
    }
}
// abstract class
abstract class Child03 extends Parent02{
    public void th(){
        System.out.println("I am good");
    }
}
public class CWH_53_Ch11_abstract {
    public static void main(String[] args) {
        Child02 c = new Child02();
//        Parent02 p = new Parent02(); // you can't do this, as this is abstract class can not be instantiated
//        Child03 c3 = new Child03();  // error
    }
}
