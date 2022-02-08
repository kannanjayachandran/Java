public class countingBits1{

public static void main(String[] args) {

    setBit(40);
}

 static void setBit(int num) {
    int result = 0;

    while (num > 0)
    {
        result += num & 1;
        num >>= 1;
    }
     System.out.println("Number of set bits are " + result + " 🚁");
 }
}

/*
A program to find the total number of set bits in a given number, Using the naive method.
The while loop can be replaced by :
    while(n>0)
    {
         if (n%2 != 0){
            result++;
        }
    n=n/2;
    }
Time complexity : Θ (Total number of bits in the number)
*/