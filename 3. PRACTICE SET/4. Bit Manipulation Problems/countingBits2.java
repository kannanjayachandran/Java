public class countingBits2 {

    public static void main(String[] args) {
        
        int num = 40, result = 0;

        while (num > 0)
        {
            num &= num-1;
            result++;
        }

        System.out.println("Number of set bits are " + result + " 🎉");
    }
}

// counting the set bits using Brian kernighan algorithm.
// Time complexity : Θ(number of set bits)