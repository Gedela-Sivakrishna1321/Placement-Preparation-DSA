import java.util.Arrays;


public class KthLargestElement {
    
    public static int kthLargestElement(int arr[], int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6,4};
        System.out.println("3rd Largest Element - " + kthLargestElement(arr, 3));

        /* 
         *      Time Complexity - O(N(Log N))
         */
    }
}
