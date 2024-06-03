package com.company;

public class CWH_31_Ch7_Methods { // A Method is nothing but a function written inside a class.
    static int logic(int x, int y)
//     int logic(int x, int y) // you need to create an object to call the method
    { // Since java is an Object oriented language, we need to write the method inside some class
        int z;
        if(x>y)
        {
            z = x+y;
        }
        else {
            z = (x+y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5, a1 = 2;
        int b = 7, b1 = 1;
        int c, c1;
//        Method invocation using Object creation
//        CWH_31_Ch7_Methods obj = new CWH_31_Ch7_Methods();
//        c = obj.logic(a,b);
//        c1 = obj.logic(a1, b1);
        c = logic(a,b);
        c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
