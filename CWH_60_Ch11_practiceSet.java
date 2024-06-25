package com.company;

abstract class Pen{
    abstract void write();
   abstract void refill();
}
class FountainPen extends Pen{
    @Override
    public void write(){
        System.out.println("Write");
    }
    @Override
    public void refill(){
        System.out.println("Refill");
    }
    public void changeNib(){
        System.out.println("Changing the Nib");
    }
}

class Monkey{
    public void jump(){
        System.out.println("Jumping....");
    }
    public void bite(){
        System.out.println("Bitting....");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void speak(){
        System.out.println("Hello human speaking");
    }
    @Override
    public void bite() {
        super.bite();
    }
    @Override
    public void jump() {
        super.jump();
    }
    public void eat(){
        System.out.println("Eating....");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartPhone2 extends Telephone{
    @Override
    void ring(){
        System.out.println("Ringing....");
    }
    @Override
    void lift(){
        System.out.println("Lifting....");
    }
    @Override
    void disconnect(){
        System.out.println("Disconnected....");
    }
}

interface TVRemote{
    void on();
    void off();
}
interface  SmartTVRemote extends TVRemote{
    void voiceOn();
    void voiceOff();
}
class SmartTV implements SmartTVRemote{
    @Override
    public void voiceOn(){
        System.out.println("voiceOn");
    }
    @Override
    public void voiceOff(){
        System.out.println("voiceOff");
    }
    @Override
    public void on(){
        System.out.println("on");
    }
    @Override
    public void off(){
        System.out.println("off");
    }
}

public class CWH_60_Ch11_practiceSet {
    public static void main(String[] args) {
        // Problem 01 and 02
//        FountainPen pen = new FountainPen();
//        pen.changeNib();

        // Problem 03
//        Human harry = new Human();
//        harry.sleep();

        // Problem 05 -->Demonstrating the polymorphism
//        Monkey m1 = new Human();
//        m1.jump();
//        m1.bite();
//        m1.speak(); error, cause the reference is monkey which does not have speak method
        // Human is also a monkey hence, it is proved polymorphism

//        BasicAnimal lovish = new Human();
//        lovish.eat();
//        lovish.sleep();
//        lovish.speak(); error, lovish is a basic animal it can not speak

        // Polymorphism--> One thing many forms
        // Ex: Human is also a Monkey, Human is also a BasicAnimal

        // Problem 04
//        SmartPhone2 sm2 = new SmartPhone2();
//        sm2.ring();
//        sm2.lift();
//        sm2.disconnect();

        // Problem 06 + 07
        // Demonstrating polymorphism
//        SmartTVRemote tv = new SmartTV();
//        tv.voiceOn();
//        tv.voiceOff();
//        tv.on(); error
//        tv.off(); error
        SmartTV tv1 = new SmartTV();
        tv1.on();
        tv1.off();
        tv1.voiceOn();
        tv1.voiceOn();



    }
}
