package Arrays;

public class MaximumSubArray {

    // Time Complexity - O(n^3)
    public static void generateAllSubArrays(int arr[]) {
        
        for(int i = 0; i < arr.length; i++) {  // Starting point of sub array
            for(int j = i; j < arr.length; j++) {  // Ending point of sub array
                for(int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println("---------------------------------------");
        }
    }

    // Time Complexity - O(n^3)
    public static int bruteForce(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++ ) {
            for(int j = i; j < arr.length; j++) {
                int sum = 0;
                for(int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                max = Math.max(max, sum);
            }
        }

        return max;
    }
    
    // Time Complexity - O(n)
    // Space Complexity - O(1)
    public static int kadanesAlgorithm(int arr[]) {

        int maxSum = 0, currSum = 0;

        for(int i = 0; i < arr.length; i++) {

            currSum += arr[i];

            if(currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);

        }

        if(maxSum == 0) {
            maxSum = Integer.MIN_VALUE;
            for(int elem : arr) {
                maxSum = Math.max(elem, maxSum);
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        
        int arr[] = {-2,-1,-3,-4,-1,-2,-1,-5,-4};
        // generateAllSubArrays(arr);
        // System.out.println(bruteForce(arr));
        // System.out.println(kadanesAlgorithm(arr)); 

        /*      Exception :- 
         *          Kadanes algorithm doesn't work for negative numbers. When all the elements of array are negative 
         *          then return the max value of the elements.
         */
    }
    
}
