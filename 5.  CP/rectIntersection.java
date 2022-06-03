/*
 Given the co-ordinates of two rectangles in the form of two arrays find if the two rectangles
 intersect or not. If the rectangles intersect then print true otherwise print false. 
 */

public class rectIntersection {
    public static void main(String[] args) {

        int[] rec1 = { 0, 0, 1, 1 };
        int[] rec2 = { 1, 0, 2, 1 };

        System.out.println(isOverlapping(rec1, rec2));
    }

    private static boolean isOverlapping(int[] arr1, int[] arr2) {

        return !(arr1[3] <= arr2[1] ||
                arr1[2] <= arr2[0] || arr1[0] >= arr2[2] || arr1[1] >= arr2[3]);
    }
}
