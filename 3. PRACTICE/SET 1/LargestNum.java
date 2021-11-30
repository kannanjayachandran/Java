
import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first Number: ");
        int a = in.nextInt();
        System.out.println("Enter the second Number: ");
        int b = in.nextInt();
        System.out.println("Enter the Third Number: ");
        int c = in.nextInt();

        //  METHOD 1
        if (a>b && a>c){
            System.out.println(a + " is the largest number.");
        }
        else if(b>a && b>c){
            System.out.println(b + "is the largest number.");
        }
        else{
            System.out.println(c + "is the  largest number.");
        }

        //  METHOD 2
        int max = a;

        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }

        System.out.println(max + " " +"is the largest number.");

        // METHOD 3

        int maxim = Math.max(c, Math.max(a,b));
        System.out.println(maxim + " " +"is the largest number.");


    }
}

/* Find the largest number among the three numbers.

 In METHOD 3, The class Math contains methods for performing basic numeric operations
    such as the elementary exponential, logarithm, square root, and trigonometric functions.
    it takes two numbers only as argument.
 */