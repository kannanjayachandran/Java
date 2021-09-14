package com.arrays;

import java.util.Arrays;

public class twoPointerArraySwap {

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }// end of main.

    static void reverse(int []arr) {
        int start = 0;
        int end = (arr.length)-1;
        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }// end of reverse.

    static void swap(int []arr, int a, int b) {
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}// end of swap.

/* Two pointer method for reversing an array. */