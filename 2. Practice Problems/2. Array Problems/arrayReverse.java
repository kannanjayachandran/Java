import java.util.Arrays;

public class arrayReverse {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("The original array is: " + Arrays.toString(arr));
        System.out.println("Reversed array is: " + Arrays.toString(arrayRev(arr)));

    }// end of main

    public static int[] arrayRev(int[] arr) {

        int start = 0, temp, end = arr.length - 1;

        while (start < end) {

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }
}