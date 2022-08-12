import java.util.Scanner;

public class lcm {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        in.close();

        System.out.println(Lcm(num1, num2) + " is the Lcm of " + num1 + " and " + num2);
    }

    static int Lcm(int first, int second) {

        for (int i = Math.max(first, second); i <= first * second; i++) {

            if (i % first == 0 && i % second == 0)
                return i;
        }
        return -1;
    }
}
