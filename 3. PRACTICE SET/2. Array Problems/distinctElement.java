public class distinctElement {

    public static void main(String[] args) {

        int []arr = {1, 2, 2, 1, 3, 3, 4, 5, 5, 6, 6};

        System.out.println("Number of distinct elements are " + finder(arr));

    } //end of main

    static int finder(int[]a)
    {
        int count = 0, unique = 0;

        for (int i = 0; i < a.length; i++) {
            unique =1;
            
            for (int j = i-1; j>=0; --j){
                if (a[i] == a[j]){
                    unique = 0;
                    break;
                }
            }
            if (unique == 1){
                count++;
            }
        }

        return count;
    }
}
