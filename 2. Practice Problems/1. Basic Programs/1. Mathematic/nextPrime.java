import java.util.Scanner;

public class nextPrime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = in.nextInt();
        in.close();

        System.out.println(prime(n) + " is the next prime number.");
    }

    static int prime(int num) {

        while (true) {

            int i;

            for (i = 2; i < num + 1; ++i) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num)
                return num;
            num++;

        }

    }

}
