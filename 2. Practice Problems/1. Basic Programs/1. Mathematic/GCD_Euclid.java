/*
A program to find the GCD of two numbers using Euclid's algorithm
*/

import java.util.Scanner;


public class GCD_Euclid{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter n1: ");
        int a  = in.nextInt();

        System.out.println("Enter n2: ");
        int b = in.nextInt();

        int temp;
        while (a != 0){
           temp = a;
           a = b % a;
           b = temp;
        }

        System.out.println("GCD: " + b);
    }
}