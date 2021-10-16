
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        // Taking length and breadth.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length\t");
        int l = in.nextInt();
        System.out.print("Enter breadth\t");
        int b = in.nextInt();

        int area = l*b;
        System.out.println("Area = " + area);
    }
}
//  Area of a rectangle...