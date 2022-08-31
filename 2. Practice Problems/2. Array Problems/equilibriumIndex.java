public class equilibriumIndex {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 5, 10, 10 };

        System.out.println(solution(arr));

    }

    private static int solution(int[] arr) {

        int leftSum = 0, sum = 0;

        // finding the sum of the array
        for (int j : arr)
            sum += j;

        for (int i = 0; i < arr.length; i++) {

            // finding the sum of the left part of the array in each iteration
            sum -= arr[i];

            if (leftSum == sum) {
                return i;
            }
            leftSum += arr[i];
        }

        // if no equilibrium index found
        return -1;
    }
}
