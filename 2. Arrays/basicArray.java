
import java.util.Arrays;
import java.util.Scanner;

public class basicArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr;  // Declaration of array in java.
        arr = new int[10];  // Initialization of an array in java.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();   // Taking inputs
        }
        System.out.println(Arrays.toString(arr));  // Printing output(The array is converted into String)
    }
}




/*
  1. In java all the arrays are dynamically allocated.
  2. Arrays are also objects in Java.
  3. Arrays can be used as a local variable, static field, or a method parameter.
  4. If primitives are stored then actual values are stored in contiguous memory location
      while objects of a class, actual objects are stored in heap segment.

      SYNTAX
             int []arr;              will declare an array.(Only a reference of array is created.)
             arr = new int[10];      This will actually create an array or give the memory to the array.

             Elements by default will be 0(numeric), False(boolean), null(string and other reference types.)


 */