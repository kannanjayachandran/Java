package com.First;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int l = in.nextInt();
        int b = in.nextInt();

        int area = l*b;
        System.out.println("Area =" + area);
    }
}
//  Area of a rectangle...