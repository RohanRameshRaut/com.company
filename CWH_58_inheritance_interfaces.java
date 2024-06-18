package com.company;

// Multiple inheritance using interfaces

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{ // You can extend an interface with another interface
    void meth3();
    void meth4();
}
//class childSampleInterface extends sampleInterface{ // You can implement the interface but You can not extend an interface with a class.
//    void meth3();
//    void meth4();
//}

class MySampleClass implements childSampleInterface{
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
}

public class CWH_58_inheritance_interfaces {
    public static void main(String[] args) {
        MySampleClass sc = new MySampleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}
