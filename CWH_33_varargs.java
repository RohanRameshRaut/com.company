package com.company;

public class CWH_33_varargs { // varargs-->aap ek function ko ek se jyada arguments de sakte hai.
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }

//    ninja technique to overcome the above problem i.e varargs

    static int sum(int x, int ...arr){ // triple dot(...arr) tells us that--> (pack all the arguments in an array called arr). mujhe jitne bhi arguments hai vo ek array me pack krke do.
//        It will Available or behave as int [] arr;
//        int x is a compulsory parameter or means give at least one parameter to the varargs method.
        int result = 0;
        for(int a: arr)
        {
            result+=a;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to varargs Tutorials");
//        System.out.println("The sum of 4 and 5 is: "+ sum(4,5));
//        System.out.println("The sum of 4 , 3 and 5 is: "+ sum(4, 3, 5));
//        System.out.println("The sum of 2, 4 , 3 and 5 is: "+ sum(2, 4, 3, 5));

        System.out.println("sum is: "+ sum(1, 2, 3, 4, 5, 6, 7, 8));
//        System.out.println("sum of nothing is: "+ sum()); // as int x is a compulsory parameter you cant call it as empty.
        System.out.println("sum of 1 is: "+ sum(1));
    }
}
