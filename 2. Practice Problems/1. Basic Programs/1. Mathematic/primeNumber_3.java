// Find whether the number is prime or not.
// This is also having sqrt of n complexity. This is just another way of implementing.

import java.util.Scanner;

public class primeNumber_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();

        if (num == 0 || num == 1)  System.out.println("Neither prime nor composite number.");
        
        else {
            int a = 2;
            while ((a * a) <= num) {

                if (num % a == 0) {
                    System.out.println("Not a prime.");
                    break;
                }
                a++;
            }
           if ((a * a) > num) System.out.println("Prime");
        }

    }

}


