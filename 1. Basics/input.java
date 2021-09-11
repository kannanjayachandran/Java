package com.First;

import java.util.Scanner; // Where scanner is located

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //input is just a name.
        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        System.out.println("You have entered: " + num);

    }
}

// Take an integer input and output it.


/* Java Scanner class allows the user to take input from the console.
        It belongs to java.util package.

        It is used to read the input of primitive types like int, double, long,
        short, float, and byte. It is the easiest way to read input in Java program.

              Syntax   Scanner sc=new Scanner(System.in);

                             TERMINOLOGY

  NEW : it instantiates a class by allocating memory for a new object and returning
        a reference to that memory. We can also use the new keyword to create the array object.

 System.in :  Take input through keyboard.
                */