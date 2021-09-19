package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String playAgain;
        int count =0;

        System.out.println("\t\tNUMBER GUESSING GAME.");
        System.out.println("\nGuess the numbers between 1 and 100");

        do {
            // Creating a random number.
            int randNum = (int) ((Math.random() * 100) + 1);
            int guessNum = 0;

            while (guessNum != randNum){

                //Asking for input and taking it.
                System.out.println("\nEnter the number ");
                guessNum = in.nextInt();

                // Comparing values
                if (guessNum > randNum){
                    System.out.println("Your guess " + guessNum + " is too high. Try again..");
                    count++;
                }
                else if (guessNum < randNum){
                    System.out.println("Your guess " + guessNum + " is too small. Try again...");
                    count++;
                }
                else{
                    System.out.println("Correct guess.\n Congrats it only took you  " + count + " tries! ");
                }
            } // end of inside while loop.

            System.out.println("\tWould you like to play again ?\t(Y/N)");
            playAgain =in.next();
        }// end of do.

        while (playAgain.equalsIgnoreCase("y"));
        {
            System.out.println("Thank you for playing! Good bye.");
            in.close();

        } // end of while loop.
    }
}

/*  NUMBER GUESSING GAME

        We will generate a pseudo random number between 1 and 100; and prompt the user to enter a number.
        If the number is less than the generated number, then we will say "too low", if it is higher; then
        "too high".

        *. GENERATING A PSEUDO RANDOM NUMBER.
           Here Math.random will give a floating point value; we multiply 100 to make it in the range of 100 (0 to 99)
           (int) will typecast the value to an integer. +1 will change the range.(1 to 100).

 */
