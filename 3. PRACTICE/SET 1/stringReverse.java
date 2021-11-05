package com.Practice1;

import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();

        StringBuilder input = new StringBuilder(a);
        input.reverse();

        System.out.println(input);

    }
}









/*  SOME FACTS ABOUT STRINGS IN JAVA
   1) Strings are immutable in java.

   2) String class doesn't have reverse() method. but;
      StringBuilder class has builtin reverse() method.

   We are taking the input from the user as a string.
   Then we are converting the string to mutable stringBuilder class.
   Then by using the reverse() method in the stringBuilder class we are reversing the string.

 */