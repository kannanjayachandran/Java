// Print all the prime numbers in a given range.

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class primeNumberRange {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        int flag, i;
        for (i = num1; i <= num2 ; i++) {

            // we want to skip if the first number is 0 or 1/
            if (i == 0 || i ==1) continue;

            flag = 1;
            for (int j = 2; j <= sqrt(i); j++){
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }// inner for loop.

            if (flag == 1) System.out.print(i + " ");
        }// outer for loop
        }
    }




