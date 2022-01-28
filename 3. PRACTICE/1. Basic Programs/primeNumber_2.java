// Check whether a number is prime or not.
// Here we run the loop only square root of num times.
// Complexity is O(sqrt(n))

import java.util.Scanner;

import static java.lang.Math.sqrt;


public class primeNumber_2 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to check: ");
        int num = input.nextInt();

        if (num == 0 || num ==  1) System.out.println(num + " is neither prime nor composite");
        else {
            int flag =0;
            for (int i = 2; i < (sqrt(num)); i++) {
                if (num % 2 == 0) {
                    System.out.println(num + " is not a prime number.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) System.out.println(num + " is a prime number.");
        }
    }
}


