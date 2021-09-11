package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
     String []arr = new String[20];
     Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }
        System.out.println(Arrays.toString(arr));
    }
}

// Taking string inputs.