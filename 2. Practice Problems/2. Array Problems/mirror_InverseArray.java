public class mirror_InverseArray {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 }; // false
        int[] brr = { 3, 4, 2, 0, 1 }; // true

        System.out.println(isInverse(arr));
        System.out.println(isInverse(brr));
    }

    public static boolean isInverse(int[] arr) {
        for (int i : arr) {

            if (arr[arr[i]] != i)
                return false;
        }
        return true;
    }
}

/*
 * 
 * If the inverse of an array is equal to the array itself it is called
 * mirror-inverse array
 * 
 */