package Arrays.Easy;

public class MaxAndMInElementOfArray {

    public static void minAndMaxOfArray(int arr[]) {
        // Variables to keep track of min & max value
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        System.out.println("Maximum Element - " + max);
        System.out.println("Minimum Element - " + min);
    }
    public static void main(String[] args) {

        int arr[] = {242,234,225,194,111};
        minAndMaxOfArray(arr);

        /*      Approach - 
         *          1) Declare two variables min & max to store the min and max values of Array
         *          2) Traverse the array and find out the min & max value
         * 
         *      Complexities - 
         *          Time Complexity - O(n), Space Complexity - O(1)
         */             
    }
}