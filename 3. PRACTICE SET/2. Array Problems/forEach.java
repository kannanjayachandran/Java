public class forEach {

    public static void main(String[] args) {

        int []arr = {1, 3, 4, 5, 6, 7, 8, 10};

        //printing array with for each loop.
        for(int i : arr){
            System.out.println(i);
        }
    }
}

/*
 for each loop traverse through each element in the collection and
 store them in the variable and execute the body of the loop.
 */