import java.util.Arrays;

/**
 * A program to find the sum of a given range in an array from given queries
 */
public class prefixSumArray {
    public static void main(String[] args) {

        int[] arr = { 1, -3, 4, 5, 6 };
        int[][] qr_arr = { { 0, 4 }, { 1, 3 }, { 1, 4 } };

        System.out.println(Arrays.toString(solution(arr, qr_arr)));
    }

    private static int[] solution(int[] arr, int[][] qr_arr) {

        int[] res = new int[qr_arr.length];

        // creating the prefix sum array
        int n = arr.length;
        int total = 0;
        int[] prefixSum = new int[n];

        for (int i = 0; i < n; i++) {
            total += arr[i];
            prefixSum[i] = total;
        }

        // finding the answer
        int start, end, result;
        for (int j = 0; j < qr_arr.length; j++) {
            start = qr_arr[j][0];
            end = qr_arr[j][1];

            if (start == 0)
                result = prefixSum[end];
            else
                result = prefixSum[end] - prefixSum[start - 1];

            res[j] = result;
        }
        return res;
    }
}
