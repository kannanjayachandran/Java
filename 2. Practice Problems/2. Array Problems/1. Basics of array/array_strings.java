// Write a program that takes string inputs into an array.

import java.util.Arrays;
import java.util.Scanner;

public class array_strings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // initializing the array.
        System.out.println("Enter the size of the array: ");
        int len = input.nextInt();
        input.nextLine();
        String []arr = new String[len];

        // Taking inputs.
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the string: ");
             arr[i] = input.nextLine();
        }

        // Printing array.
        System.out.println(Arrays.toString(arr));
    }
}

/*
// This .nextInt() method does not read the newline character in the input created by hitting "Enter,".
when we use .nextLine() that newline character is read into the collection, and cause undesired results.
we can either use a .nextLine() after each nextInt or we can take the input using nextLine and convert it
into required formats.
 */