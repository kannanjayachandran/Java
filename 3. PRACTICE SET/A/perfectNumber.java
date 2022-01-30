
import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        int a = in.nextInt();
        int s = 0;

        for (int i = 1; i < a; i++) {

            if (a % i == 0){
                s = s +i;
            }
        }

        if (s == a){
            System.out.println("It is a perfect number.");
        }
        else{
            System.out.println("Not a perfect number.");
        }
    }
}

/*
   PERFECT NUMBER
            6 has the divisors 1,2,3 and 1+2+3 = 6 , hence a perfect number.
 */