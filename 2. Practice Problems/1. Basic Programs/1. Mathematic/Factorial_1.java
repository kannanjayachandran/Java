import java.util.Scanner;

public class Factorial_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int fact = 1;

        while (num > 0) {
            fact *= num;
            num--;
        }
        System.out.println("Factorial is " + fact);
    }
}

// Factorial of a number using while loop