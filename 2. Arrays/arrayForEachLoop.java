
public class arrayForEachLoop {
    public static void main(String[] args) {
        int []arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i; // Populating array with 0,1,2,3,4
        }
        for (int i : arr) {       // For every i (element)  in arr {print the element}
            System.out.print(i);
        }
    }
    }

//   Enhanced for loop: For each loop
// for (dataType Element of array(The reference variable) : Name of array)  {}