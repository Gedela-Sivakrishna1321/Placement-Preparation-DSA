public class SelectionSort {
    
    public static void selectionSort(int arr[]) {
       
        for(int i = 0; i < arr.length-1; i++) {
            int minPos = i;
           
            for(int j = i+1; j < arr.length; j++) {
                if(arr[minPos] > arr[j])  {
                      minPos = j;
                }
                      
            }

            // Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for(int elem : arr)
            System.out.print(elem + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 3, 2};
        selectionSort(arr);
        printArr(arr);
        
        /*
         *      Approach :- Find out the minimum element and push it to the start of the array
         * 
         *      Complexities :- 
         *              Time Complexity - O(n^2), Space Complexity - O(1)
         * 
         *      Note :- 
         *          It doesn't perform better than bubble sort in terms of time complexity
         *          but definitely reduces the number of swaps comapred to that of in bubble sort.
         */
    }
}
