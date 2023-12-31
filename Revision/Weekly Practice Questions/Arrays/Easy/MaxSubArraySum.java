package Arrays.Easy;

public class MaxSubArraySum {

    // Time Complexity - O(n^3), Space Complexity - O(1)
    public static int bruteForceApproach(int arr[]) { 
        int maxSum = 0;

        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=i; j<arr.length; j++) {
                int end = j;
                int sum = 0;
                for(int k=start; k<=end; k++) {
                    sum += arr[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    // Time Complexity - O(n^2), Space Complexity - O(n)
    public static int prefixSumApproach(int arr[]) {
        int maxSum = 0;
        int n = arr.length;

        // Calculate the prefix sum and store it in prefix array
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i=1; i<n; i++) {
            prefix[i] = arr[i] + prefix[i-1];
        }

        // Run the two for loops and Calculate the currentSum with formula currSum = prefix[end] - prefix[start-1]
        // And update the maxSum

        for(int i=0; i<n; i++) {
            int start = i;
            for(int j=i; j < n; j++) {
                int end = j;
                // currSum = prefix[end] - prefix[start-1]
                int currSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start-1];
                // Update the maxSum
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }

    public static int kadanesAlgoApproach(int arr[]) {
        int maxSum = 0;
        int currSum = 0;
        for(int i=0; i<arr.length; i++) {
            // Add the current element to currSum
            currSum += arr[i];
            
            // Check, If currSum < 0 then update currSum = 0
            if(currSum < 0) {
                currSum = 0;
            }

            // update maxSum
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Max Subarray Sum - "+bruteForceApproach(arr));
        System.out.println("Max Subarray Sum - "+prefixSumApproach(arr));
        System.out.println("Max Subarray Sum - "+kadanesAlgoApproach(arr));
    }
    
}
