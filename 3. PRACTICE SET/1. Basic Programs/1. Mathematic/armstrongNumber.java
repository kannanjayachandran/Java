import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number");
        int a = in.nextInt();

        System.out.println(isArmstrong(a));
    } // end of main.

    // Function to check the number.
    static boolean isArmstrong(int a) {

        int b = a;
        int sum = 0;

        while (a > 0) {
            int temp = a % 10;
            sum += (temp * temp * temp);
            a /= 10;
        }

        return sum == b;
    }
}

// This will check if a given number is armstrong number or not.