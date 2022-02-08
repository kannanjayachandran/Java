public class Brian_Kerninghan_algorithm{

    public static void main(String[] args) {

        int result = 0, num = 20;
        
        while (num > 0)
        {
            num &= num-1;
            result++;
        }
        System.out.println("Number of set bits are " + result + " 🚁");
    }
}


/*
    Brian Kernighan's Algorithm : For counting the set bits in a number.

    When 1 is subtracted from a given number (decimal number); all the bits
    after last set bit (rightmost set bit); is flipped.
    (zero becomes one; one becomes zero) Set bits -> 1

    If we Subtract 1 from a number and do bitwise and with the number [num & (num-1)] and execute
    it inside a loop untill the num becomes zero; The loop would be executed the set-bits number of times.

    Time complexity : Θ(number of set bits)

*/