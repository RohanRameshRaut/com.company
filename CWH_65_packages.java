package com.company;

// Using java packages

//import java.util.Scanner; // 1) importing only the Scanner class from java.util
//import java.util.*; // 2) importing all the classes from java.util

public class CWH_65_packages {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in); // 3) using the scanner class by giving the path of the class
        int a = sc.nextInt();
        System.out.println("This is my Scanner taking input as " + a);


        // At the end go through the VS Code
    }
}
