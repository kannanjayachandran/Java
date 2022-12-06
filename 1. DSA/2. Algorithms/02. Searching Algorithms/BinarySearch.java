import java.util.Scanner;

public class binarySearch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // taking array input
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the " + i + " number: ");
            arr[i] = in.nextInt();
        }

        // taking the target value
        System.out.println("Enter the target value: ");
        int target = in.nextInt();

        // calling the binary search function
        binary_Search(n, arr, target);
    }// end of main

    // binary search function
    private static void binary_Search(int n, int[] arr, int target) {

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                System.out.println("Element target is found at " + mid);
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
}
