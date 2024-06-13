package com.company;

// Method Overriding and Method Overloading both are different topics
// Method Overloading: Creating the same named methods in the same class with different parameters
// Method Overriding: Overwriting the method of Base class or modifying it in Derived class with same name but with different content.
// Method Overriding: All should be same like base classs's method ex: access type, return type and parameters too.
class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override // not compulsory, just for the information to the programmer to know that we overridden the method in A.
    public void meth2(){ // Overrides method in A.
        System.out.println("I am method 2 of class B ");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B ");
    }
}
public class CWH_48_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2(); // will run the meth2 of Class B as the object of that class.
    }
}
