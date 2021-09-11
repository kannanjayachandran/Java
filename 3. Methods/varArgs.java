package com.methods;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
       // fun(7,3,4,5,6,1,8,9,2);
       // multi(2,5,5,6,7,7,8,6,5);
        diff(83, "Casey", "david");

    }

    static void diff(int a, String...v) {
        System.out.println(a);
        System.out.println(Arrays.toString(v));
    }

    static void multi(int a, int b, int...v) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }

    static void fun(int...var) {
        Arrays.sort(var);
        System.out.println(Arrays.toString(var));

    }
}




/*
                     VARIABLE LENGTH ARGUMENTS
   static int fun(int ... name){
                 }

         When we don't know how many arguments we are passing to the function;
         we use variable length argument.
         Internally the "int...name" will be taken as an array.
         "String...name"  will take an array of strings.
        Since it is taking inputs as an array we can print the output using Arrays.toString

        Variable length argument should always come at the last while using multiple arguments.
 */