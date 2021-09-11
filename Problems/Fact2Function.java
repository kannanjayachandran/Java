package com.Practice1;

import java.util.Scanner;

public class Fact2Function {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.println(facto(a));
    }


    static int facto(int a){
        int temp = 1;
        while (a > 0) {
            temp *= a;
        a--;
        }
        return temp;
    }
}
// Finding factorial using a function....