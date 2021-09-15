package com.Practice1;

import java.util.Scanner;

public class fib {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = in.nextInt();

        int first = 0; // First term ; which is zero...
        int second = 1;  // Second term ie; 1
        int count = 2;

        while (count <= num){  // Till count becomes equal to n run the loop...

            int temp;   // A temporary variable for storing second value.
            temp = second; // Storing value of second in a temporary variable, otherwise we will lose it in next step...
            second = second + first; // First term + Second term
            first = temp;   // Inserting the previously second term as the First term...
            count++;
        }  //end of while.

        System.out.println("sum of first " + num +" fibonacci series is " + second);
    }
}


// This method is very inefficient as it has limitation and consumes more processing and memory power...