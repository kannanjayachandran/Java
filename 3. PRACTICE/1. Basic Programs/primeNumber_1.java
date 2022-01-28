// Find whether a given number is prime or not.
// Here we use a  optimization; instead of running the loop 'num' times we run it  num/2 times.
// Complexity is O(n/2)

import java.util.Scanner;

public class primeNumber_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to check: ");
        int num =  input.nextInt();

        if (num == 0 || num == 1) System.out.println(num + " is neither prime nor composite.");

        else
        {
            int flag  = 0;
            for (int i = 2; i < (num/2); i++) {
                if (num % 2 == 0)
                {
                    System.out.println(num + " is not a prime number.");
                    flag =1;
                    break;
                }
            }
            if (flag == 0) System.out.println(num + " is a prime number.");
       }
    }
}
