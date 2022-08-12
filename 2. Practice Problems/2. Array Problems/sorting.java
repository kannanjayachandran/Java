import java.util.Arrays;

public class sorting {
    
    public static void main(String[] args) {

        int[] arr = {9, 7, 5, 2, 6, 1, 3, 4, 8};
        int []brr = arr.clone();

        // sorting an array using the inbuilt method.
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }
}

// .clone() is an inbuilt way to clone or copy.