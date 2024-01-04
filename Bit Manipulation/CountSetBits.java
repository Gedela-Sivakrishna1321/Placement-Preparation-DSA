public class CountSetBits {
    
    public static int countOfSetBits(int num) {
        int count = 0;
        // Run loop while num = 0
        while(num > 0) {
            if((num & 1) != 0) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOfSetBits(-1));

        /*      Note :- 
         *          The number of bits required to represent a Decimal number in binary is - Log(n) + 1
         *      
         *      Time Complexity :- O(Log N) --> Because we travel the loop, Log N times
         *         
         */
    }
}
