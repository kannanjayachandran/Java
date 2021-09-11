package com.arrays;

import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][]arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
// Multi-dimensional Array.
// Here we are using an enhanced for loop.

