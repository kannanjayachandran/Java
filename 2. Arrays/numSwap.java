package com.arrays;

import java.util.Arrays;

public class numSwap {
    public static void main(String[] args) {

        int []arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(arr));
        swap(arr,2,3);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

//  To swap to elements inside an array using a function.