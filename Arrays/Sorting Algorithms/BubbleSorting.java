public class BubbleSorting {

    public static void bubbleSort(int arr[]) {
        int swap = 0;
        for(int turn = 0; turn < arr.length-1; turn++) {
            
            for(int j = 0; j < arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0) {
                System.out.println("Array is already sorted .." + turn);
                break;
            }
                
        }
    }

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) 
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        int arr2[] = {1,2,3,4,5};
        bubbleSort(arr2);
        printArray(arr2);

        /*
         *      Approach :- 
         *             1) Compare the adjacent elements and push the largest element to the end
         * 
         *      Complexities :-
         *              Time Complexity - O(n^2), Space Complexity - O(1)
         *    Best case - Time Complexity - O(n) when the array is already sorted
         */
    }
}