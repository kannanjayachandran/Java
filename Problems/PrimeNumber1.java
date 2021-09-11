package com.Practice1;

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        int n, m, f = 0;
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        m = n / 2;   // Because if n = 10 and m = 5, we just have to check for 3 & 4... All others will be multiples
        if (n == 0 || n == 1) System.out.println(n + "is neither prime nor composite"); // for the number 2

        else {
            for (int i = 2; i < m; i++) {
                if ((n % i) == 0) {
                    System.out.println(n + "is not a prime number");
                    f = 1;  /* if this 'if' condition is satisfied then f is updated. */
                    break;
                }
            }
            if (f == 0) System.out.println(n +" " + "is a prime number");
        }
    }
}


/*  Program to check if the given number is prime or not
     This is the simplest method.
     This method will be O(n) : Linear time.
 */