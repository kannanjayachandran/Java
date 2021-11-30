
import java.util.Scanner;

public class numOccurrence {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the large  number ");
        int a = in.nextInt();
        System.out.println("Enter the number to check occurrence in the large number");
        int b = in.nextInt();

        int count = 0;

        while(a > 0) {
            int rem = a % 10; //  a % 10 will give the last digit ie;
                             // if we divide any number by 10 the last digit will be the remainder...
            if (rem == b) {
                count++;
            }
            a /= 10; // This step is to remove the last digit.
        }

        System.out.println(count);

    }
}

/* A program to check the occurrence of a particular number in a large number

  Here we are using the remainder method, but we can also use logical operators to do the same.

 */