// First n fibonacci numbers.

import java.util.Scanner;

public class fibonacci_series {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number below 45 ");
        int num = input.nextInt();

        int first = 0, second = 1, count = 2;

        System.out.print("The series is: "+first + ", ");
        while (count <= num)
        {
            int temp = second;
            second += first;
            first = temp;
            System.out.print(first + " ,");
            count++;
        }
        System.out.println(second);

        System.out.println("The "+ num+"th fibonacci number is "+ second);
    }
}
