package com.company;

class Employee01{
    int salary;
    String name;
    public int getSalary()
    {
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}

class Cellphone{
    public void ringing(){
        System.out.println("Ringing.....");
    }
    public void vibrating(){
        System.out.println("Vibrating.....");
    }
    public void callFriend(){
        System.out.println("Calling Ved....");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    float length, breadth;
    public float area(){
        return length*breadth;
    }
    public float perimeter(){
        return 2*(length+breadth);
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firring on the enemy");
    }

}

class Circle{
    float Pi = 3.14f, r;
    public float area(){
        return Pi*(r*r);
    }
    public float perimeter(){
        return 2*(Pi*r);
    }
}
public class CWH_39_Ch8_practiceSet {
    public static void main(String[] args) {
        // Problem 01
//        Employee01 harry = new Employee01();
//        harry.setName("Rohan Ramesh Raut");
//        harry.salary = 233;
//        System.out.println(harry.getName());
//        System.out.println(harry.getSalary());

        // Problem 02
//        Cellphone asus = new Cellphone();
//        asus.callFriend();
//        asus.vibrating();
//        asus.ringing();

        // Problem 03
//        Square sq = new Square();
//        sq.side = 3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

        // Problem 04
//        Rectangle rec = new Rectangle();
//        rec.length = 6;
//        rec.breadth = 4;
//        System.out.println(rec.area());
//        System.out.println(rec.perimeter());

        // Problem 05
//        Tommy player1 = new Tommy();
//        player1.fire();
//        player1.run();
//        player1.hit();

        // Problem 06
        Circle cr = new Circle();
        cr.r = 3;
        System.out.println(cr.area());
        System.out.println(cr.perimeter());

    }
}
