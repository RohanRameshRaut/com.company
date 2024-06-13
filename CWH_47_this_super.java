package com.company;

import javax.print.Doc;

class EkClass{
    int a;
    public int getA(){
        return a;
    }
    EkClass(int a){
        this.a = a; // this. is a way for us to reference an object of the class which is being created/referenced.
        // this.a points or refers to the int a of the class.
    }
    public int returnoner(){
        return 1;
    }
}

class DoClass extends EkClass{
    DoClass(int c){
        super(c); // used to invoke the custom constructor instead of default constructor.
        // as you can see, we don't have the default constructor in the base and we are running the parameterised constructor.
        // In other words, "muze super class ke us constructor ko run krna hai, jo ki ek integer leta hai. so, i.e super(c).
        System.out.println("Main ek constructor hun!");
    }
}
public class CWH_47_this_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(65);
        DoClass d = new DoClass(5);
        System.out.println(e.getA());
    }
}
