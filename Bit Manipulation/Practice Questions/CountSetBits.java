// package Practice Questions;

public class CountSetBits {
    
    public static int noOfSetBitsIn(int num) {
        int count = 0;
        while(num > 0) {
           
            if((num & 1) != 0) {
                count++;
            }
            // Right Shift 1 bit in num
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(noOfSetBitsIn(15));
        
    }
}
