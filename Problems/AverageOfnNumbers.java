package com.Practice1;
import java.util.Scanner;

public class AverageOfnNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers are there ? ");
        int numOfTimes = in.nextInt();
        int sum = 0;
        int count = 0;

        while (count < numOfTimes) {

            System.out.println("Enter " + (count+1) + " number: ");
            int num = in.nextInt();
            sum += num;
            count++;
        }
        System.out.println("Average is " + (sum/count));
    }
}

// This will print the average of the entered numbers.