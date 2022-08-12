// Initialize, fill, and access elements in an array.

import java.util.Arrays;
import java.util.Scanner;

public class array_intro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int len = input.nextInt();

        // initializing the array.
        int []arr = new int[len];

        //filling the array.
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number: ");
            arr[i] = input.nextInt();
        }

        //Displaying elements of array.
        for (int j : arr) System.out.print(j+ " ");
    }
}

/*
  1. In java all the arrays are dynamically allocated.
  2. Arrays are also objects in Java.
  3. Arrays can be used as a local variable, static field, or a method parameter.
  4. If primitives are stored then actual values are stored in contiguous memory location
      while objects of a class, actual objects are stored in heap segment.

SYNTAX:
 int []arr;  will declare an array.(Only a reference of array is created.)
 arr = new int[10];  This will actually create an array or give the memory to the array.
 Elements by default will be 0(numeric), False(boolean), null(string and other reference types.)
 */