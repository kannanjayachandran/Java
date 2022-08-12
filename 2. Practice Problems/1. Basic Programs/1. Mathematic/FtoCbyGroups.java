import java.util.Scanner;

public class FtoCbyGroups {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the starting value: ");
        int a = in.nextInt();
        System.out.println("Enter the end value: ");
        int b = in.nextInt();
        System.out.println("Enter the Progression value: ");
        int c = in.nextInt();

        for (float i = a; i <= b; i += c) {
            int temp = (int) ((i * 9 / 5) + 32);
            System.out.println("Fahrenheit Temp is: " + i + " , " + "Celsius temp is: " + temp);
        }
    }
}

// This Programme will take min value and max value of fahrenheit temperature
// and a progression value also.
// then it will display all the conversions in celsius .