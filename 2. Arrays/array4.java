package com.arrays;

import java.util.Arrays;

public class array4 {
    public static void main(String[] args) {
        int []arr = new int[]{1, 2, 3, 45, 6, 7};
        System.out.println(Arrays.toString(arr));
        int [] brr;
        brr = change(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }

    static int[] change(int[] arr) {
        arr[4] = 456;
        return arr;
    }
}
