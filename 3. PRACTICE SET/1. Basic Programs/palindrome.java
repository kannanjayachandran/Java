// A program to check whether a given number is palindrome or not.

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();

        int number = 0, temp, copy = num;
        while (num != 0){
            temp = num % 10;
            number = (number * 10) + temp;
            num /= 10;
        }

        if (copy == number)  System.out.println(number + " is a palindrome number.");

        else System.out.println(copy + " is not a palindrome number.");
    }
}

//A palindrome number is a number that is same after reverse.
