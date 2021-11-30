
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        System.out.println("Enter Temperature in C: ");
        Scanner input = new Scanner(System.in);
        float tempC = input.nextFloat();
        float tempF= (tempC * 9/ 5) + 32;

        System.out.println("Temperature in fahrenheit is : " + tempF);

    }
}

// Program to convert temperature in degree celsius to Fahrenheit