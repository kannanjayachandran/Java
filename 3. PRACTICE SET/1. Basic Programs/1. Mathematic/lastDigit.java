import java.util.Scanner;

public class lastDigit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = in.nextInt();
        in.close();

        num %= 10;

        System.out.println("Last digit is " + num);
    }
}
