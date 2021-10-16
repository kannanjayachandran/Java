package com.arrays;

import java.util.Scanner;

public class isArraySorted {
    public static void main (String[] args){

        Scanner in  = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int num = in.nextInt(); // Number of elements in array.

        int[] arr = new int[num];

         //Populating array.
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the " + i + "elements: ");
            arr[i] = in.nextInt();
        }

        //edge case
        if (arr.length == 1 || arr.length == 0) {
            System.out.println("Sorted");
            return;
        }

        // Checking by calling sorted function
       if (sorted(arr)){
           System.out.println("Sorted");
       }
       else System.out.println("Not sorted");

    }// end of main

    // Sorted function.
    static boolean sorted(int[] arr) {

        for (int j = 0; j < arr.length-1; j++) {
            if (arr[j] > arr[j + 1]) {
               return false;
            }
        }
        return true;
    }
}
