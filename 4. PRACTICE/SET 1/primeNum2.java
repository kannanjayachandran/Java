package com.Practice1;



import java.util.Scanner;

public class primeNum2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();          // The name here and name in method call should be the same.
        System.out.println(isPrime(a));
    }

    static boolean isPrime(int n){          // Here the name can be anything.
        if (n == 1 || n == 0){
            return false;
        }
        int b=2;  // Starting to check from 2.
        while (b*b <= n) {    // because we need to only check till the square root of n ,
                              // as the same digits will repeat after that.
            if (n % b == 0) {
                return false;
            }
            b++;
        }
        return b * b > n;  //  This means till the sqrt(n) we didn't find any multiples, so it is a prime number

    }
}


/*   Checking if a given number is prime or not.
   Here we use a function to check.
   Time complexity of this code is O(sqrt(n))
 */