package com.company;

import java.util.Scanner;

public class CWH_79_errorsdemo {
    public static void main(String [] args){
//        SYNTAX ERROR DEMO
//        int a = 0 // Error: no semicolon
//        b = 8; // Error: b not declared!

//    LOGICAL ERROR DEMO
//    Write a program to print all the prime numbers between 1 to 10
//        System.out.println(2);
//        for(int i=1;i<5;i++){
//            System.out.println(2*i+1);
//        } // Error: logic is not correct to print all prime number, it is also printing the number 9.

//        RUNTIME ERROR(CAUSED AT RUNTIME BY USER)
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is; "+ 1000/k);
    }
}
