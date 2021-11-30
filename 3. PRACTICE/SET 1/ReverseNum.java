
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the  number: ");
        int a = in.nextInt();
        int b= 0;

        while (a > 0) {
            int rem = a % 10; // Taking the last digit
            a /= 10;  // eliminating the last digit
            // If we multiply the last digit by 10 and add that in reverse order we get the number in the reverse order
            b = b * 10 + rem;
        }
        System.out.println(b);
    }
}

// A program to reverse a given integer number using a simple while loop
