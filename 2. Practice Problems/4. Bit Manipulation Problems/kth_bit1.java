public class kth_bit1 {

    public static void main(String[] args) {

        int num =5, k = 3;

        if ((num & (1<<(k-1))) > 0) System.out.println("bit is set🥳");
        else System.out.println("Not set👎");
    }
}

/*
A program to check if the k-th bit is set or not; using the left shift operator.
Unlinke C / C++; boolean datatypes are just True and False in Java.
    (They are not converted into intergers; we have to explicitely convert.🤢🤮)
*/