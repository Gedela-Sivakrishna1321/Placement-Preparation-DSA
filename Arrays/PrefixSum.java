public class PrefixSum {
    
    public static int maxSubarraySum(int[] numbers) {

        int currSum = 0, maxSum = Integer.MIN_VALUE;
        // Create a Prefix array to store Prefix Sum
        int prefixSum[] = new int[numbers.length];
        prefixSum[0] = numbers[0];

        for(int i=1; i<numbers.length; i++) {
            prefixSum[i] = prefixSum[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;

                currSum = (start == 0) ? prefixSum[end] : prefixSum[end] - prefixSum[start-1];
                maxSum = Math.max(currSum, maxSum);
            }
        }
        
        return maxSum;
    }
    public static void main(String[] args) {
        int numbers[] = {1,-3,4,3,-6};
        int maxSubarraySum = maxSubarraySum(numbers);    
        System.out.println("Max Sub array sum = " + maxSubarraySum);
        /* 
         *  Time Complexity = O(n^2) , Space Complexity = O(1)
         */
    }
}