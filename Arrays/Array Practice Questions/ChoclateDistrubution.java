import java.util.Arrays;

public class ChoclateDistrubution {

    public static int choclateDistrubution(int arr[], int m) {
        int n = arr.length;
        // Base condition
        if(n == 0 || m == 0 || (n < m)) 
            return 0;
        
        // sort the array
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        int end = m-1;

        for(int i=0; i<n; i++) {
            if(end >= n)
                break;
            
            int diff = arr[end] - arr[i];
            min_diff = Math.min(min_diff, diff);
            end++;
        }
        return min_diff;
    }
    
    public static void main(String[] args) {
        
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        System.out.println("Minimum difference b/w the max & min choclates = " + choclateDistrubution(arr, 3));

        /*  
         *          Approach :- 
         *             1) First check the base conditions then sort the array. 
         *             2) Declare a variable min_diff and initialize with INT_MAX and 
         *                another variable end to track the end of sub array.
         *             3) Loop through the elements, check if(end >= n) then break
         *                 calculate the diff = arr[end] - arr[i];
         *                update the min_diff = Math.min(min_diff, diff)
         *             4) Return min_diff
         *          
         *          Complexities :- 
         *              Time Complexity - O(N(logN)), Space Complexity - O(1)
         */
    }
}
