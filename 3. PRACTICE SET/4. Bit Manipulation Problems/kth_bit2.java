public class kth_bit2 {
    public static void main(String[] args) {

        int num = 5, k = 3;

        if ((num >> (k-1) & 1) > 0) System.out.println("Bit is set🥳");
        else System.out.println("Not set👎");     
    }
}

// A program to check if the k-th bit is set or not; using the right shift operator.
