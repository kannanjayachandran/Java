// A Program to convert temperature in degree celsius to Fahrenheit

import java.util.Scanner;

public class temp_converter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in celsius: ");
        float tempC = input.nextInt();

        float tempF = ((tempC * 9) / 5) + 32;
        System.out.println("Temperature in Fahrenheit is " + tempF);
    }
}

