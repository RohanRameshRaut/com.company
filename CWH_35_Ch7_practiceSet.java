package com.company;

import java.util.Scanner;

public class CWH_35_Ch7_practiceSet {
//    static void mult(int n){
//        for(int i=1;i<=10;i++)
//        {
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
////            System.out.println(" ");
//        }
//    }

//    static void pattern1(int n)
//    {
//        char ch = '*';
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<i+1;j++)
//            {
//                System.out.print(ch);
//            }
//            System.out.println();
//        }
//    }
//
//    static int natural_sum(int n)
//    {
////        int sum=0;
////        sum = n + nsum(n-1);
//        if(n==0)
//        {
//            return 0;
//        }
//        else {
//            return n + natural_sum(n-1);
//        }
//
//    }

//    static void pattern2(int n)
//    {
//        char ch = '*';
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=n;j>=i-1+1;j--)
//            {
//                System.out.print(ch);
//            }
//            System.out.println();
//        }
//    }

//    static int fibo(int n)
//    {
////        if (n == 1) {
////            return 0;
////        }
////        else if(n==2){
////            return 1;
////        }
//        // or
//        if(n==1 || n==2)
//        {
//            return n-1; // above 2 conditions are merged here.
//            // if n == 1 return(n-1) = 1-1 i.e 0;
//            // if n == 2 return(n-1) = 2-1 i.e 1;
//        }
//        else {
//           return fibo(n-1) + fibo(n-2);
//        }
//    }

//    static int setSum(int...arr)
//    {
//        int sum =0;
//        for(int element: arr)
//        {
//            sum+=element;
//        }
//        return sum/(arr.length);
//    }

////    static void pattern2_rec(int n)
////    {
////        if (n > 0) {
////            pattern2_rec(n-1); // this recursion will decrement the value of n so, that the below pattern will only get executed when all n gets ended
////            for(int i=0;i<n;i++)
////            {
////                System.out.print("*");
////            }
////            System.out.println();
////        }
//        // Calls resolved here
//        // pattern2_rec(3)-->1st resolve the below condition cause (n-1)
//        // pattern2_rec(2)-->1st resolve the below condition cause (n-1)
//        // pattern2_rec(1)-->now the value of n is 1, 1st resolve the below condition cause (n-1)
//        // pattern2_rec(0)-->now the value of n is 0, will not enter, in the if condition and will execute the above condition
//        // pattern2_rec(1) = for loop will print 1 star and a new line
//        // pattern2_rec(2) = back to the n=2, for loop will print 2 star and a new line
//        // pattern2_rec(3) = back to the n=3, for loop will print 3 star and a new line
//
//    }

//    static void pattern4_rec(int n) {
//        if (n > 0) {
//            for (int i = 0; i < n; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            pattern4_rec(n - 1);
//        }
//    }

//    static float temperature(float cel)
//    {
//        float far = 0;
//        far = (cel * (9/5.0f)) + 32; // divide 5.0f instead of 5, cause integer divisor will result integer only
//        return far;
//    }


    static int natural_sum_iterative(int n)
    {
        int sum=0;
        if(n==0)
        {
            return 0;
        }
        else {
            for(int i=1;i<=n;i++)
            {
                sum+=i;
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        // Problem 1
//        int num;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number to find the Multiplication Table: ");
//        num = sc.nextInt();
//        System.out.println("Multiplication table of: "+ num);
//        mult(num);

        // Problem 2
//        pattern1(4);

        // Problem 3
//        System.out.println("first 5 natural numbers sum is: "+ natural_sum(5));

        // Problem 4
//        pattern2(4);

        // Problem 5
//        System.out.println(fibo(5));

        // Problem 6
//        System.out.println("setSum: "+ setSum(1,2,3,4,5));

        // Problem 8
//        pattern2_rec(4);

        // Problem 7
//        pattern4_rec(4);

        // Problem 9
//        System.out.println("Convert: "+ temperature(32));

        // Problem 10
        System.out.println("Natural sum using iterative: "+ natural_sum_iterative(5));

    }
}
