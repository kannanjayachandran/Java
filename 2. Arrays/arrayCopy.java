
import java.util.Arrays;

public class arrayCopy {
    public static void main(String[] args) {

        // Copying the elements of an array to another.
        String []arr = {"Alternative","use" ,"the" ,"shortcut", "syntax",
                          "to", "create", "and", "initialize", "an", "array"};
        String []brr = new String[7];
        System.arraycopy(arr, 3, brr, 0, 7);
        System.out.println(Arrays.toString(brr));
    }
}


/*
    COPYING AN ARRAY : System.arraycopy(name of source array  , src array starting
                        index(From where we want to start copying) , name of
                         destination array , dst starting index , Number of elements to copy)
                  SRC CODE:
                   String[] arr = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                        "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                        "Marocchino", "Ristretto" };

        String[] brr = new String[7];
        System.arraycopy(arr, 2, brr, 0, 7);
        for (String coffee : brr) {
            System.out.print(coffee + " ");
        }
 */