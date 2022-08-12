// Find the n th fibonacci number.

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number below 45 ");
        int num = input.nextInt();

        int first = 0, second = 1, count = 2;
        while (count <= num)
            {
                int temp = second;
                second += first;
                first = temp;
                count++;
            }
        System.out.println("The "+ num+"th fibonacci number is "+ second);
    }
}

// This is not the efficient way to find the n-th fibonacci term. It would only give correct answer till n=45. 