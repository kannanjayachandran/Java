// Bubble sort implementation.

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {

        int []arr = {1, 99, 27, 19, 33, 87, 67, 56, 48};
        System.out.println("The array before sorting is: " + Arrays.toString(arr));

        // Bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length)- i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("The array after sorting is: " + Arrays.toString(arr));
    }
}