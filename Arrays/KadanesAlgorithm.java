public class KadanesAlgorithm {
    
    public static int maxSubArraySum(int[] numbers) {

        int cs = 0, ms = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            
            cs += numbers[i];

            if(cs < 0) {
                cs = 0;
            }

            ms = Math.max(cs,ms);
        }

        if(cs == 0) {
            ms = Integer.MIN_VALUE;
            for(int i=0; i<numbers.length; i++) {

                ms = Math.max(ms, numbers[i]);
            }
            return ms;
        }
        return ms;
    }
    
    public static void main(String[] args) {
        
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int nums[] = {-1, -2, -3, -4};
        System.out.println("Max Sub array sum = " + maxSubArraySum(numbers));
        System.out.println("Max Sub array sum = " + maxSubArraySum(nums));

        /*
         *  Time Complexity = O(n), Space Complexity = O(1)
         *  This is the best way to calculate the max sub array sum.  
         */
    }
}
