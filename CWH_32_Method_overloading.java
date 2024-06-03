package com.company;

public class CWH_32_Method_overloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
    }
    static void change(int x){
        x = 98;
    }
    static void change2(int[] arr){
        arr[0] = 98;
    }

    static void tellJoke(){ // void return type explained here
        System.out.println("I invented a new joke \n"+ "Plagiarism");
    }
    public static void main(String[] args) {
//        tellJoke();
//        Case 1: changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is: "+ x);

//        Case 2: Changing the array
//        int [] marks = {52, 73, 77, 89, 98, 94}; // marks is a reference of object {52, 73, 77, 89, 98, 94};
//        change2(marks); // value will change as we are passing the reference i.e marks
//        System.out.println("The value of marks[o] after running change is: "+ marks[0]);

//        Method Overloading
        foo();
        foo(3000);
        foo(3000, 4000); // arguments are actual (actual value hoti hai).


    }
}
