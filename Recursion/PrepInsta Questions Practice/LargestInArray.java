public class LargestInArray {
    
    public static int largestElement(int arr[], int i, int largest) {
        // Base case
        if(i == arr.length) {
            return largest;
        }

        // Logic of the function
        largest = Math.max(largest, arr[i]);

        // recursive call
        return largestElement(arr, i+1, largest);
    }

    public static void main(String[] args) {
        
        int arr[] = {6,3,2,5,4,8};
        System.out.println(largestElement(arr, 0, Integer.MIN_VALUE));

        // Time Complexity - O(N)
    }
}
