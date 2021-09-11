package com.First;

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a  = in.nextInt();

        int sum=0, product=1;
        while(a > 0){
            int temp = a % 10;
            sum += temp;
            product *= temp;

            a /= 10;
        }
        int diff = product - sum;
        System.out.println(diff);

    }
}

/*A program to compute the products of the digits and subtract it from the  sum of the digits...

     234 : product = 24
          Sum = 9
         Answer = 24 - 9 = 15

 */