// Area of a circle

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Defining  Pi
        final float Pi = 3.14f;

        System.out.println("Enter the radius: ");
        int radius = in.nextInt();

        // Math.pow ; A method for finding the power.
        double area = Pi*(Math.pow(radius, 2));

        System.out.println("Area of the Circle is " + area);
    }
}


