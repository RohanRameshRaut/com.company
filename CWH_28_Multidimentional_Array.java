package com.company;

import java.util.Scanner;

public class CWH_28_Multidimentional_Array {
//  defining or declaring a function inside the main function (or any other function) is not allowed according to the language standards.

    // Method to display a 2D array
    public static void display(int[][] matrix, int row, int col) {
        System.out.println("Printing the 2D array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" "); // For spacing between elements
            }
            System.out.println(); // For new line after each row
        }
    }

    public static void main(String[] args) {
        // Multidimensional arrays are array of arrays each element of a M-D array is an array itself,
        // marks in the previous example was a 1-D array.

        int[] marks; // A 1-D Array
        int[][] flats; // A 2-D Array
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying 2-D Array (for loop)
        System.out.println("Printing 2-D array using for loop");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        // Transpose of the Matrix
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of the cols: ");
        int col = sc.nextInt();
        int[][] flats1 = new int[row][col];
        int[][] transpose = new int[col][row]; // Note: Transpose should have flipped dimensions

        System.out.println("Accepting the 2D array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter flats1[%d][%d]: ", i, j);
                flats1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose of the matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = flats1[i][j];
            }
        }
        display(flats1, row, col);
        display(transpose, col, row); // Correct dimensions for the transposed matrix
    }
}
