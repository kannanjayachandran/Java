//  Counting the number of set bits using look up table method.
public class countingBits3 {

    public static void main(String[] args) {
        
        int []arr = new int[256];
        int num = 40;
        starter(arr);
        
        System.out.println("Number of set bits are " +  count(arr, num));
    }

    static void starter(int []arr){
        arr[0] = 0;

        for (int i = 0; i < 256; i++) {
            arr[i] = (1 & i) + arr[i/2];
        }
    }

    static int count(int []arr, int num){
        int result = 0;

        for (int i = 0; i < 4; i++) {
            
            result += arr[num & 0xff];
            num >>= 8;
        }

        return result;
    }
}