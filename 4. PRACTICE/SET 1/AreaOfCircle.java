
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        final float Pi = 3.14f; // Defining  Pi
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = in.nextInt();  // Taking radius
        double area = Pi*(Math.pow(r, 2));  // Math.pow ; A func for powering.

        System.out.println("Area of the Circle is " + area);
    }
}

/*
 AREA OF A CIRCLE
 */