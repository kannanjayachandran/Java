package com.arrays;



public class array3 {
    public static void main(String[] args) {
        int []arr = new int[5];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i : arr) {       // For every i (element)  in arr {print the element}
            System.out.print(i);
        }
    }
    }

//   Enhanced for loop:
// for (dataType Element of array(The reference variable) : Name of array)  {}