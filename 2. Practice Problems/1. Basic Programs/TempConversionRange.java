import java.util.Scanner;

public class TempConversionRange {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int min, max, step;

        System.out.println("Enter the min value: ");
        min = in.nextInt();

        System.out.println("Enter the max value: ");
        max = in.nextInt();

        System.out.println("Enter the increment value: ");
        step = in.nextInt();

        for (int i = min; i <= max; i += step) {

            double temp = ((i * 9.0) / 5) + 32;
            System.out.println(i + " Celsius is " + temp + " Fahrenheit.");
        }
        in.close();
    }
}
