// Take an integer input and output it.

import java.util.Scanner; 

public class input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");

        int num = input.nextInt();

        System.out.println("You have entered: " + num);

    }
}

/* Java Scanner class allows the user to take input from the console. It belongs to java.util package.
This is the use of the line (import java.util.Scanner).

It is used to read the input of primitive types like int, double, long, short, float, and byte. 
It is the easiest way to read input in Java program.

TERMINOLOGY

NEW : it instantiates a class by allocating memory for a new object and returning
a reference to that memory. We can also use the new keyword to create the array object.

System.in :  Take input through keyboard.
*/