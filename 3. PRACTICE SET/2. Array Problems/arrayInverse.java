import java.util.Arrays;
import java.util.Scanner;

public class arrayInverse {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };

        System.out.println("The array is: " + Arrays.toString(arr));

        System.out.println("Inverse of the array is: " + Arrays.toString(inverseArray(arr)));

    }

    public static int[] inverseArray(int[] arr) {

        int[] inv = new int[arr.length];

        for (int i = 0; i < arr.length - 1; ++i) {

            inv[arr[i]] = i;
        }

        return inv;
    }
}

/*
 * 
 * Inverse of array : Array elements are swapped with their corresponding indices.
 * The array is called mirror-inverse if it's inverse is equal to itself.
 */
