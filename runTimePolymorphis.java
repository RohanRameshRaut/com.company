package com.company;

class Student{
    String name = "Om";
    public void on(){
        System.out.println("Turning on Phone");
    }
}
class Monitor extends Student{
    String name = "Yash";
    public void on(){
        System.out.println("Turning on SmartPhone");
    }
}
public class runTimePolymorphis {
    public static void main(String [] args){
        Student s = new Monitor();
        System.out.println(s.name);
        s.on();
    }
}
