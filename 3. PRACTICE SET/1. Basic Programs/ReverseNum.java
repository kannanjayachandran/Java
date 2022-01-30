// A program to reverse a given integer number.

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();

        int number = 0;
        while (num != 0)
        {
            int last = num % 10;
            num /= 10;
            number = (number * 10) + last;
        }
        System.out.println("Reversed number is " + number);
    }
}

// If we multiply the last digit by 10 and add that in reverse order we get the number in the reverse order.