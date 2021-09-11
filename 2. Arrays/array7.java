package com.arrays;

import java.util.Arrays;

public class array7 {
    public static void main(String[] args) {
        int []arr = {21, 89, 43, 25, 87,47, 320};
        System.out.println(Arrays.toString(arr));
        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int []arr, int a, int b){
        int temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
    }
}

//  To swap to elements inside an array.