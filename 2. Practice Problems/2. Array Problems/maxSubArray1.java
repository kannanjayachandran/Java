public class maxSubArray1 {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        maxArraySum(arr);
    }

    public static void maxArraySum(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();

            }

        }
    }

}

/*
 * Max Sub Array
 * 
 * Given an array X[] of n integers, write a program to find the maximum
 * sum of the sub array among all sub arrays.
 * 
 * A Sub array of array X[] is a contiguous segment of elements from
 * X[i] through X[J] where 0 <= i <= j <= n.
 * 
 * If the array X[] is all non-negative numbers, the maximum sub array
 * would be the sum of the entire array.
 * 
 * Several sub arrays may have the same max sum, but we need to just
 * return the value of the max sub array sum.
 * 
 * 
 * We use the two outer loop to explore the sub arrays and Time complexity is
 * O(n^3)
 */