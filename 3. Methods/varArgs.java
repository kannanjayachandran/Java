package com.methods;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        varInt(90, 80, 70, 60, 50, 40);
       varINT2(10, 25, 3,5,6,78,5);
        diffPARA(83, "Casey", "david");

    }

    static void diffPARA(int a, String...v) {
        System.out.println("Method 3");
        System.out.println(a);
        System.out.println("String array is" + Arrays.toString(v));
    }

    static void varINT2(int a, int b, int...v) {
        System.out.println("Method 2 ");
        System.out.print(a + "\t");
        System.out.println(b);
        System.out.println("Array = " + Arrays.toString(v));
    }

    static void varInt(int...var) {
        System.out.println("Method 1");
        System.out.println("Array = " + Arrays.toString(var));
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