public class MaxSubArraySum {
    
    public static int maxSubArraySum(int arr[]) {

        int currSum = 0;
        int maxSum = 0;

        for(int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if(currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum);
        }

        if(maxSum == 0) {
            maxSum = Integer.MIN_VALUE;
            for(int i = 0; i < arr.length; i++)
                maxSum = Math.max(maxSum, arr[i]);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {-2, -1, -3, -4, -1, -2, -1, -5, -4};
        System.out.println("Max Sub Array Sum = " + maxSubArraySum(arr));

        /*
         *      Approach :- 
         *          Use Kadanes Algorithm to find the max subarray sum 
         * 
         *      Complexities :- 
         *          Time Complexity - O(n), Space Complexity - O(1)
         */
    }
}
