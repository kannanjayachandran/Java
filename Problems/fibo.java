package com.Practice1;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int F = 0; // First term ; which is zero...
        int S = 1;  // Second term ie; 1
        int temp, count = 2;

        while (count <= n){  // Till count becomes equal to n run the loop...
            temp = S; // Storing value of S in a temporary variable, otherwise we will lose it in next step...
            S = S + F; // First term + Second term
            F = temp;   // Inserting the previously second term as the First term...
            count++;

        }
        System.out.println(S);
    }
}


// This method is very inefficient as it has limitation and consumes more processing and memory power...