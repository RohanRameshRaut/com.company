package com.company;

public class CWH_34_recursion {
    // factorial(0) = 1
    // factorial(n) = n * n-1 *...1
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    // factorial(n) = n * factorial(n-1) --> a function calling itself is called the recursion
    static int factorial(int n){
        if (n == 0 || n == 1) {

            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    static int factorial_iterative(int n){
        if (n == 0 || n == 1) {

            return 1;
        }
        else {
            int fact = 1;
            for(int i=n;i>=1;i--){
                fact *=i;
            }
            return fact;
        }
    }
    public static void main(String[] args) {
        System.out.println("factorial using factorial: " + factorial(0));
        System.out.println("factorial using factorial_iterative: " + factorial_iterative(5));
    }
    // Quiz create a fibonacci series in Java

}
