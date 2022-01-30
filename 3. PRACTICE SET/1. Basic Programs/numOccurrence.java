// A program to check the occurrence of a particular digit in a  number.

import java.util.Scanner;

public class numOccurence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();
        System.out.println("Enter the number to check: ");
        int digit = input.nextInt();

        int count = 0;
        while (num > 0)
        {
            int remainder = num % 10;
            if (remainder == digit) count++;
            num /= 10;
        }

        System.out.println(digit + " occurs " + count + " times.");

    }
}