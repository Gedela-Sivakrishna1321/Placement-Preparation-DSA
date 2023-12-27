public class SortArray {

    public static void bubbleSort(int arr[]) {

        for (int turn = 0; turn < arr.length -1; turn++) {

            for (int j = 0; j < arr.length - 1 - turn; j++) {

                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }

    public static void selectionSort(int arr[]) {

        for(int i = 0; i<arr.length - 1; i++) {
            int maxPos = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[maxPos] < arr[j])
                    maxPos = j;
            }
            // Swap them
            int temp = arr[i];
            arr[i] = arr[maxPos];
            arr[maxPos] = temp;
        }
    }
    
    public static void insertionSort(int arr[]) {

        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            // Finding the correct position to insert
            while(prev >= 0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void countSort(int arr[]) {

        int largest = Integer.MIN_VALUE;
        // Find the maximum value from the array
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Declare a count array
        int count[] = new int[largest + 1];
        // Store the frequency of elements
        
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
       
        // Variable to store the values in the original array
        int j = 0;
        
        // loop through count array & store the values back
        for(int i=count.length-1; i >= 0; i--) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
   
    public static void printArray(int arr[]) {
        for (int elem : arr)
            System.out.print(elem + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { -3, -6, -2, 1, 8, 7, 4, 5, 3, 1 };
        // o/p - 8, 7, 6, 5, 4, 3, 3, 2, 1, 1
    //    bubbleSort(arr); 
        /*      Approach :- 
         *          1) Run the outer loop from turn = 0 to turn < n - 1
         *          2) Run the inner loop from j = 0 to j < n - 1 - turn
         *          3) In the inner loop, if(arr[j] > arr[j+1]) then swap the values
         *      Complexities :- 
         *          Time Complexity - O(n^2), Space Complexity - O(1)
         */
       
        // selectionSort(arr);
        /*     Approach :- 
         *          1) Outer loop runs from i = 0 to n-1
         *          2) Declare a minPos variable to store the current index of outer loop
         *          3) Inner loop runs from  j = i + 1 to j < n
         *          4) Compare in inner loop, If (arr[minPos] > arr[j]) // swap the indices
         *          5) Now, swap the arr[i] with arr[minPos]
         */
        
        //    insertionSort(arr);
         /*    Approach :- 
          *         1) Run a loop from i = 1 to i < arr.length
                    2) int curr = arr[i];
                       int prev = i - 1;
                    3) While(prev >= 0 && arr[prev] > arr[curr]) {
                        arr[prev+1] = arr[prev];
                    }
                    arr[prev+1] = arr[curr];
          */
       
              countSort(arr);
        /*      Approach :- 
         *          1) Find the range / maxElement from the array
         *          2) Declare a count[] with size = [largest + 1]
         *          3) Store the frequency of elements in the count array
         *          4) Now store the values back from count array to original array
         *      
         *      Complexities :- 
         *          Time Complexity - O(n + range), Space Complexity - O(1)
         *     
         *      Note :- Count sort is preferred when the range of the numbers is less 
         *              while the quantity of numbers may be more
         */
         
         printArray(arr);
    }
}