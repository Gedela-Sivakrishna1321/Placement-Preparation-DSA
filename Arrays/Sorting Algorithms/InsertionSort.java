public class InsertionSort {
    
    public static void insertionSort(int arr[]) {
        
        for(int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
           // Find out the current position to insert
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Insert 
            arr[prev + 1] = curr;
        }
    }

    public static void printArray(int arr[]) {
        for(int elem : arr)
            System.out.print(elem + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);
        printArray(arr);

        /*
         *      Approach :- 
         *             We assume that first element is sorted and remaining elements are unsorted. We pick an element 
         *             from the unsorted array and place it in the correct position of sorted array.
         * 
         *     Complexities :- 
         *              Time Complexity - O(n^2), Space Complexity - O(1)
         */
    }
}
