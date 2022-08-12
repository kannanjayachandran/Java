import java.util.Scanner;

public class multiDimensionalArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[2][2];

        for (int row = 0; row < arr.length; row++) {
            System.out.print(row + 1 + " ROW ");

            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(col + 1 + " column");
                arr[row][col] = in.nextInt();
            }
        }

        for (int[] row : arr) {

            for (int col : row) {

                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
// Multi-dimensional Array in java.
