// Write a Program to check if the entered letter is uppercase or lowercase

import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the character: ");
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " is Lowercase");
        }
        else if (ch >= 'A' && ch <= 'Z'){
            System.out.println(ch + " is Uppercase");
        }
        else{
            System.out.println("Please enter a valid alphabet.");
        }
    }
}

/*
  next() : Finds and returns the next complete token from this scanner.
  trim() : Returns a string whose value is this string, with all leading and trailing space removed.
  charAt() : Returns the char value at the specified index.
 */