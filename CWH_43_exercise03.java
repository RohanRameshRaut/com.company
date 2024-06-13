package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    static int noOfGuess = 0;
    int computerInput, userInput;
    public Game(){
        Random random = new Random();
        computerInput = random.nextInt(100);
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number from 1 to 100: ");
        userInput = sc.nextInt();
        noOfGuess++;
    }
    public void isCorrectNumber(){
        if (userInput == computerInput) {
            System.out.println("Congrats You guessed the right number!");
        } else if (userInput<computerInput) {
            System.out.println("Small number");
        } else if (userInput>computerInput) {
            System.out.println("Big number");
        }
        else {
            System.out.println("Enter number between 1 to 100 only.");
        }
    }
}
public class CWH_43_exercise03 {
    public static void main(String[] args) {
        /*
        * Create a class Game which allows a user to play "Guess the Number"
        * game once. Game should have the following methods:
        * 1. Constructor to generate random number
        * 2. takeUserInput() to take a user input of number
        * 3. isCorrectNumber() to detect whether the number entered by the user is true
        * Use properties such as noOfGuesses(int), etc to get this task done.
        * */
        Game player01 = new Game();
        do{
            player01.takeUserInput();
            player01.isCorrectNumber();
        }while(player01.userInput!= player01.computerInput);
        System.out.println("Your input: "+ player01.userInput);
        System.out.println("Original number: "+ player01.computerInput);
        System.out.println("Number of Guesses: "+player01.noOfGuess);

    }
}
