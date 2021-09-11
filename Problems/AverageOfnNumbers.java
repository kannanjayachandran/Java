package com.Practice1;

import java.util.Scanner;

public class AverageOfnNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the numbers you want to enter: ");
        int s =  in.nextInt();
        int sum = 0;
        int temp = s;
        while(s > 0){
            System.out.println("Enter number: ");
            int num = in.nextInt();
            sum += num;
            s--;
        }
        int ave  = sum/temp;
        System.out.println(ave);
    }
}

// This will print the average of the entered numbers.