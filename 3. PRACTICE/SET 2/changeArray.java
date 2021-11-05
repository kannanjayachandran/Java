
import java.util.Arrays;

public class changeArray {
    public static void main(String[] args) {

        int []arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Array is " + Arrays.toString(arr));

        int[] brr = change(arr);

        System.out.println("Changed array is " + Arrays.toString(brr));
    }// end of main

    static int[] change(int[] arr) {
        arr[0] = 100;
        arr[4] = 50;
        return arr;
    }
}
