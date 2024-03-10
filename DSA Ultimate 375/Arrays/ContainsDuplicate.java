package Arrays;
import java.util.Arrays;

public class ContainsDuplicate {

    // Time Complexity - O(n)
    // Space Complexity - O(n) because storing the frequency of elements
    public static boolean countFrequencyApproach(int arr[]) {
        // Find out the maximum value of array
        int max = Integer.MIN_VALUE;
        for(int elem : arr) 
            max = Math.max(elem, max);

        // Declare a count arr
        int count[] = new int[max+1];

        // Store the frequency
        for(int elem : arr)
            count[elem]++;

        // Loop through count array and check if any elements frequency is > 1
        for(int freq : count) {
            if(freq > 1) {
                return true;
            }
        }

        return false;
    }

    // Time Complexity - O(nLogn)
    // Space Complexity - O(1)
    public static boolean sortArrayApproach(int arr[]) {
        Arrays.sort(arr);
        // Check if any adjacent elements are equal
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1])
                return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,-1};
        // System.out.println(countFrequencyApproach(arr));
        // System.out.println(sortArrayApproach(arr));
    }
    
}
