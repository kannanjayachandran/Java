package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("\t\tNUMBER GUESSING GAME");
        System.out.println("\nGuess a number between 1 and 100\n");

        // Generating a p.random number between 1 and 100.
        int randomNumber = (int)(Math.random()*100)+1;

        int guess = 0;
        int count =0;
        while (guess != randomNumber){

            System.out.println(" Enter the number: ");
            guess = in.nextInt();
            if (guess > randomNumber){
                System.out.println(guess + " Too high.. Try again");
                count++;
            }
            else if (guess < randomNumber){
                System.out.println(guess + " Too low... Try again");
                count++;
            }
            if (guess == randomNumber){
                System.out.println("\n\nCorrect\tYou won\n \tYou guessed in " + count + " tries");
            }
        } //  end of while
    } // end of main.
}

/*  NUMBER GUESSING GAME

        We will generate a pseudo random number between 1 and 100; and prompt the user to enter a number.
        If the number is less than the generated number, then we will say "too low", if it is higher; then
        "too high".
 */