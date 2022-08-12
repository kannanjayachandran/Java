/*
     Write a program to print the sum of negative numbers, sum of positive even 
     numbers and the sum of positive odd numbers from a list of numbers (N) entered 
     by the user.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class sums {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int neg_sum = 0, odd_sum = 0, even_sum = 0, n;

        ArrayList<Integer> arr = new ArrayList<>(10);

        System.out.println("Enter the numbers: ");

        while (in.hasNextInt()) {
            n = in.nextInt();
            arr.add(n);
        }
        in.close();

        for (Integer i : arr) {
            if (i > 0 && i % 2 == 0) {
                even_sum += i;
            } else if (i > 0 && i % 2 != 0) {
                odd_sum += i;
            } else if (i < 0) {
                neg_sum += i;
            }
        }

        System.out.println("Even numbers sum: " + even_sum);
        System.out.println("Odd numbers sum: " + odd_sum);
        System.out.println("Negative numbers sum: " + neg_sum);
    }
}
