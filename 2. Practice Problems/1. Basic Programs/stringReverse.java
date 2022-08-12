// Reverse the given string.

import java.util.Scanner;

public class stringReverse {

 public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        StringBuilder converter = new StringBuilder(name);

        System.out.println(converter.reverse());
    }
}


/*
   1) Strings are immutable in java.

   2) String class doesn't have reverse() method. but;  StringBuilder class has builtin reverse() method.

We are taking the input from the user as a string. Then we are converting the string to mutable stringBuilder class.
Then by using the reverse() method in the stringBuilder class we are reversing the string.
 */