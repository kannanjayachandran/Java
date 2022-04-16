package com.Practice1;

import java.util.Scanner;

public class Factorial_function {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = in.nextInt();

        // Calling the function.
        System.out.println(facto(num));
    }

    static int facto(int a) {
        int temp = 1;
        while (a > 0) {
            temp *= a;
            a--;
        }
        return temp;
    }
}
// Finding factorial using a function; Here the value is returned by the
// function.