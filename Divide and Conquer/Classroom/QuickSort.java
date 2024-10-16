public class QuickSort {

    public static void quickSort(int arr[], int si, int ei) {
        // Base case
        if(si >= ei) {
            return;
        }

        // Find pivot element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); // sort left part
        quickSort(arr, pIdx+1, ei); // sort right part
    }

    public static int partition(int arr[], int si, int ei) {
        // pivot element
        int pivot = arr[ei];
        int i = si - 1; // To make space for elements less than pivot

        for(int j=si; j<ei; j++) {
            if(arr[j] < pivot) {
                i++;
                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot at correct position
        i++;
        // int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = pivot;
        return i;
    }

    public static void print(int arr[]) {
        for(int i=0; i<arr.length; i++) 
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        
        int arr[] = {6,3,2,9,8,5,-1,-9};
        quickSort(arr, 0, arr.length-1);
        print(arr);

        /*      Approach :- 
         *          1) Choose pivot element
         *          2) Place the pivot at correct position
         *          3) Apply quick sort to sort the left & right parts of the pivot
         * 
         *      Time complexity :- 
         *          Average case - O(nLogN)
         *          Worst case - O(n^2)
         * 
         *      Space complexity :- O(1) 
         *          
         */
     }
    
}
