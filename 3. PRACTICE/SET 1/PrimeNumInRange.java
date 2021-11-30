
import java.util.Scanner;

public class PrimeNumInRange {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the last number :");
        int num2 = in.nextInt();

        for (int i = num1; i < num2; i++) {  // A for loop running from beginning number to last number.
            int a = 2;
            //Checking if a number is divisible by any number.
            while (a*a <= i) {
                // If divisible break;
                 if (i % a == 0) {
                     break;
                }
                 else a++;
            if(a*a > i) System.out.println(i);   // If no number could divide then it is a prime.
            }
        }
    }
}


// Program to print all prime numbers between two given numbers.
