
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Taking length and breadth.
        System.out.print("Enter length\t");
        int length = in.nextInt();
        System.out.print("Enter breadth\t");
        int breadth = in.nextInt();

        int area = length*breadth;
        System.out.println("Area = " + area);
    }
}
//  Area of a rectangle