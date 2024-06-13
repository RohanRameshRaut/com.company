package com.company;

import java.util.Random;
import java.util.Scanner;

public class CWH_41_RockPaperGame_Ex02Solution {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor: ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput == computerInput)
        {
            System.out.println("Draw");
        }
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1)
        {
            System.out.println("You win!");
        }
        else {
            System.out.println("You loose!");
        }
        System.out.println("Computer choice: "+ computerInput);


    }
}
