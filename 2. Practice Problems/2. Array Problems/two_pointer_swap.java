import java.util.Arrays;

public class two_pointer_swap {
    public static void main(String[] args) {

        // reversing an array using two pointer swap
        int []arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int start = 0, temp = 0;
        int end = arr.length - 1;

        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}

// Reversing the array using two pointers. (start and end)