package com.company;
import java.util.Scanner;

public class CWH_29_Ch6_practiceSet {
    public static void main(String[] args) {
        // Practice Problem 1
//        float [] marks = {45.7f, 67.8f, 99.2f, 100.0f, 2.3f};
//        float sum = 0;
//        for(int i=0;i<marks.length;i++)
//        {
//            sum = sum + marks[i];
//        }
//        or
//        for(float element:marks)
//        {
//            sum +=element;
//        }
//        System.out.println("Sum of float array is: "+ sum);

        // Practice Problem 2
//        int [] marks = {2, 4, 5, 78, 33, 22, 45};
//        int num;
//        boolean isInArray = false;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        num = sc.nextInt();
//        for(int i=0;i<marks.length;i++)
//        {
//            if(marks[i] == num)
//            {
//                isInArray = true;
//                break; // if the value found at the beginning then no need to go further trace.
//            }
//        }
//        if(isInArray)
//        {
//            System.out.println("Present in array");
//        }
//        else
//        {
//            System.out.println("Not present in array");
//        }

        // Practice Problem 3
//        float [] marks = {45.7f, 67.8f, 99.2f, 100.0f, 2.3f};
//        float sum = 0;
//        for(float element:marks)
//        {
//            sum +=element;
//        }
//        System.out.println("Average marks are: "+ sum/marks.length);

        // Practice Problem 4
//        int [][] mat1 = { {1, 2, 3},
//                          {4, 5, 6}};
//        int [][] mat2 = { {2, 6, 13},
//                          {3, 7, 1}};
//        int [][] result = {{0, 0, 0},
//                           {0, 0, 0}};
//
//        for(int i=0;i<mat1.length;i++)
//        {
//            for(int j=0;j<mat1[i].length;j++)
//            {
//                System.out.format("Setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//
//        }
//        //  Printing the elements of a 2-D Array.
//        for(int i=0;i<mat1.length;i++)
//        {
//            for(int j=0;j<mat1[i].length;j++)
//            {
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println(" ");
//
//        }

        // Practice Problem 5
        int [] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
//        System.out.println(l); ans-->6
        int n = Math.floorDiv(l, 2); // nearest integer ex: 10//3-->3, but the quotient is 3.33 so floorDiv() ignores it.
//        System.out.println("midPoint: "+ n); ans-->3, representingIndex-->4
        int temp;
        for(int i=0;i<n;i++)
        {
            // Swap arr[i] and arr[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for(int element: arr)
        {
            System.out.println(element);
        }

        // Practice Problem 6
//        float [] marks = {45.7f, 67.8f, 99.2f, 2.3f};
//        float max = 0; // or you can take java's Integer.MIN_VALUE i.e -2147483647
//        for(int i=0;i<marks.length;i++)
//        {
//           if(marks[i]>max){
//               max = marks[i];
//           }
//        }
//        System.out.println("Max number in array is: "+ max);

        // Practice Problem 7
//        float [] marks = {45.7f, 67.8f, 99.2f, 2.3f, 1.0f};
//        float min = 0; // or you can take java's Integer.MAX_VALUE i.e 2147483647
//        for(int i=0;i<marks.length;i++)
//        {
//            for(int j=1;j<marks.length-1;j++)
//            {
//                if(marks[j]>marks[i]){
//                    min = marks[i];
//                }
//           }
//        }
//        System.out.println("Min number in array is: "+ min);

        // Practice Problem 8
        float [] marks = {45.7f, 67.8f, 99.2f, 2.3f, 1.0f};
//        float [] marks = {45.7f, 67.8f, 99.2f};
        boolean isSorted = true;
        for(int i=0;i<marks.length-1;i++)
        {
                if(marks[i]>marks[i+1]){
                    isSorted = false;
                    break;
                }

        }
        if(isSorted)
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }






    }
}
