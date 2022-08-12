import java.util.Scanner;

public class GCD {

    static int ans;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1, num2;
        System.out.println("Enter the numbers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        in.close();

        int min = num1 < num2 ? num1 : num2;

        System.out.println(gcd(num1, num2, min) + " is the GCD of " + num1 + " and " + num2);
    }

    static int gcd(int num1, int num2, int min) {

        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ans = i;
            }
        }

        return ans;
    }

}
