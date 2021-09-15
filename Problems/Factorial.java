package com.Practice1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int fact=1;

        while(num > 0) {
            fact *= num;
            num--;
        }
        System.out.println("Factorial is " + fact);
    }
}



/*
           Using for loop:
                            for(i=a; i>0; --i){
                                 temp *= i;
                                 --a;
                            }
*/