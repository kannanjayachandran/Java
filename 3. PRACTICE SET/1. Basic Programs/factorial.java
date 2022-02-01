// Write a program to find the factorial of a given number.
//Factorial Program using loop.

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();

        int fct = 1;
        for (int i = 1; i <= num; i++) {
            fct *= i;
        }

        System.out.println(fct);
    }
}

