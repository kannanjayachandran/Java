// Check whether a number is prime or not.
// This is the least optimized way. 
// Complexity is O(n)

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int flag = 0;
        System.out.println("Enter the number to check: ");
        int num = input.nextInt();

        if (num == 0 || num ==1)  System.out.println(num + " is neither prime nor composite.");
        else
        {
            for (int i = 2; i < num ; i++)
            {
                if (num % i == 0)
                {
                    System.out.println("Not a prime number.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) System.out.println("Prime number.");
        }
    }
}
