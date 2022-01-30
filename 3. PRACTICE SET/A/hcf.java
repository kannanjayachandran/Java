package com.Practice1;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        int a,b,i,hcf=0;
        Scanner in =new Scanner(System.in);
         a = in.nextInt();
         b = in.nextInt();

        for (i = 1; (i <= a) || (i <= b); i++) {
            if (((a % i) == 0) && ((b % i) == 0)) {
                hcf = i;
            }
        }

        System.out.println(hcf);
    }
}

