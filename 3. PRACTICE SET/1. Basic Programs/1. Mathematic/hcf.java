import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b, i, hcf = 0;
        System.out.println("Enter the first number: ");
        a = in.nextInt();
        System.out.println("Enter the second number: ");
        b = in.nextInt();

        for (i = 1; (i <= a) || (i <= b); i++) {
            if (((a % i) == 0) && ((b % i) == 0)) {
                hcf = i;
            }
        }

        System.out.println("Hcf of " + a + " and " + b + " is " + hcf);
    }
}

// Java program to find hcf of a given number.