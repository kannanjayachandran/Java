package com.arrays;

import java.util.Arrays;

public class inBuiltSorting {
    public static void main(String[] args) {

        int[] arr = {9, 7, 5, 2, 6, 1, 3, 4, 8};
        int[] brr = arr.clone();
        System.out.println(Arrays.toString(brr));
//        int []crr = Arrays.sort(arr);
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}


//  Sorting using inbuilt sort functions.