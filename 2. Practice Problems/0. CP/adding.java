import java.util.Scanner;

public class adding {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b;

        a = in.nextInt();
        b = in.nextInt();
        in.close();

        System.out.println(a + b);
    }

}
