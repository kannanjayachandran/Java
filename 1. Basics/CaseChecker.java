package com.First;

import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }
    }
}

/*
Program to check if the entered letter is uppercase or lowercase

  next() : Finds and returns the next complete token from this scanner.
  trim() : Returns a string whose value is this string, with all leading and trailing space removed.
  charAt() : Returns the char value at the specified index.

 */