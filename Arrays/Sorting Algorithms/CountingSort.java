public class CountingSort {
    
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        // Find the largest element from the array
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        // Count the frequency of elements
        for(int i=0; i<arr.length; i++) 
            count[arr[i]]++;

        int j = 0;
        // Store the values in the original Array Back
        for(int i = 0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int arr[]) {
        for(int elem : arr)
            System.out.print(elem + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArray(arr);

        /* 
         *      Approach :- 
         *          Find the largest element from the array and initialize a count array 
         *          with size [largest + 1]. Store the frequency of the elements in count 
         *          array. Now loop through the count array and store the values in the 
         *          original Array.
         * 
         *      Complexities :- 
         *          Time Complexity - O(n + range), Space Complexity - O(largest)
         */
    }
}
