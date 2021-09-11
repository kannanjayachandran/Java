package com.Practice1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int temp=1;
        while(a > 0) {
            temp *= a;
            a--;
        }
        System.out.println(temp);
    }
}



/*
           Using for loop:
                            for(i=a; i>0; --i){
                                 temp *= i;
                                 --a;
                            }
*/