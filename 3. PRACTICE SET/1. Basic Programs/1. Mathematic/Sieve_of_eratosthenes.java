/*
Java program to find all the prime numbers below a given number, using the sieve of eratosthenes method.
It can be used for numbers around 10^7.
It is having a time complexity of  O(N log (log N))
 */

import java.util.Scanner;

public class Sieve_of_eratosthenes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = input.nextInt();

        eratosthenes(number);
    } // end of main

    static void eratosthenes(int number) {

        int[] arr = new int[number + 1];
        arr[1] = 0;

        // Filling the array with one
        for (int i = 2; i < number; i++) {
            arr[i] = 1;
        }

        // finding the multiples and making their value to zero
        for (int i = 2; i * i <= number; i++) {
            if (arr[i] == 1) {
                for (int j = i * i; j <= number; j += i) {
                    arr[j] = 0;

                }
            }
        }

        // Checking how many values are still 1 and printing them
        for (int i = 1; i <= number; i++) {
            if (arr[i] == 1)
                System.out.print(i + " ");
        }
    }
}
