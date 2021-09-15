package com.Practice1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("\t\t\tWELCOME\t\t");
        System.out.println();
        int a = 0;

        // An infinite loop with a loop breaking mechanism.
        while (true) {
            System.out.println("Select an operator ( + - * / % )");
            System.out.println("Press X to Quit");
            char ch = in.next().trim().charAt(0);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {

                System.out.println("Enter the two numbers");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                // ADDITION.
                if (ch == '+') {
                    a = num1 + num2;
                }

                // SUBTRACTION.
                if (ch == '-') {
                    a = num1 - num2;
                }

                // MULTIPLICATION.
                if (ch == '*') {
                    a = num1 * num2;
                }

                // DIVISION.
                if (ch == '/') {
                    if (num2 == 0) {
                        System.out.println("Division by Zero is not possible"); break;}
                    else a = num1 / num2;
                }

                // MODULUS.
                if (ch == '%') {
                    a = num1 % num2;
                }
                System.out.println(a);
            }

            // Exiting the loop.
            else if (ch == 'x' || ch == 'X'){
                break;
            }

            // Edge case.
            else System.out.println("Invalid operator");

        }
    }
}

/*
            SIMPLE CALCULATOR USING IF ELSE STATEMENT

             First it will ask for selecting an operator.
             If any valid operator is selected then it will ask to input two numbers and perform the operation
             if invalid operator is pressed then it will say "invalid operator"

            August 20 : bug 1
                   If you do a division with 0 as denominator then it will say " Division with  0  is not possible",
                         but; still  give some value...  *****   Solved on August 26....
 */