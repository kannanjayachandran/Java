import java.util.Scanner;

public class Palindrome_neg {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();

        if (num < 0){
            System.out.println(num + " is not a palindrome number.");
            return;
        }

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

// This is a program to check if a given number is palindrome or not.
// If a negative number is given it would considered as a non-palindrome number.