// Copying elements of one array to another.
import java.util.Arrays;

public class arrayCopy {
    
    public static void main(String[] args) {

        String []arr = {"one", "two", "three", "four"};
        String []brr = new String[arr.length];

        System.arraycopy(arr, 0, brr, 0, 4);

        System.out.println(Arrays.toString(brr));
    }
}

/*
System.arraycopy : (name of source array, source array starting
                index(From where we want to start copying),
                name of destination array , destination starting index,
                Number of elements to copy)
 */