import java.util.Scanner;

public class mixedFraction {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n, d, a, b;
        n = in.nextInt();
        d = in.nextInt();
        in.close();

        a = n / d;
        b = n % d;

        if (a == 0)
            System.out.println(n + " " + d);
        else
            System.out.println(a + " " + b + "/" + d);
    }
}