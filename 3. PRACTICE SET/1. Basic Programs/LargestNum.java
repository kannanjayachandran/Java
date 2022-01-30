// Find the largest number among the three numbers.

import java.util.Scanner;

public class LargestNum {

    public static void main(String[] args) {
        // Find the largest number among the three numbers.

        Scanner input = new Scanner(System.in);

        int first, second, third;
        System.out.println("Enter the first number");
        first = input.nextInt();
        System.out.println("Enter the second number");
        second = input.nextInt();
        System.out.println("Enter the third number");
        third = input.nextInt();

        //Method 1
        if (first > second && first > third) System.out.println(first + " is the largest number.");
        else if (second > first && second > third) System.out.println(second + " is the largest number.");
        else if (third > first && third > second) System.out.println(third + " is the largest number.");

        //Method 2
        int max = first;
        if (second > max) max = second;
        if (third > max) max = third;
        System.out.println(max+ " is the largest number.");

        //Method 3
        int large = Math.max(first, Math.max(second, third));
        System.out.println(large + " is the largest number.");
    }
}

/*
The class Math contains methods for performing basic numeric operations such as the elementary exponential, logarithm,
square root, and trigonometric functions. It takes two integer arguments only.
*/
