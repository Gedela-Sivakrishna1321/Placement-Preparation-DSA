package Arrays;

public class SearchInRotatedSortedArray {

    // Time Complexity - O(logn)
    // Space Complexity - O(1)
    public static int searchInRotatedArray(int arr[], int key) {
        // Take two pointers
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {

            int mid = (left + right)/2;

            // Key found condition
            if(arr[mid] == key)
                return mid;

            // Left Part sorted condition
            if(arr[left] < arr[mid]) {
                if(arr[left] <= key && key < arr[mid]) {
                    right = mid - 1;
                } 
                else {
                    left = mid + 1;
                }
            } 
            else {
                if(arr[mid] < key && key <= arr[right] ) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }

            }
        }
        return -1;
    }


    public static void main(String[] args) {
        
        int arr[] = {5,6,7,8,9,10,1,2,3,4};
        int key =  6;

        System.out.println(searchInRotatedArray(arr, key));

        /*      Approach :- 
         *          This is very similar to binary search. Here the array is sorted and rotated at some index.
         *          So, Instead of going for linear search, we can use the sorting property.
         *          
         *          // Array is sorted 
         *          If(arr[start] < arr[mid]) { 
         *              // search in the left part
         *          }
         *          else {
         *           // search in the right part
         *          }
         * 
         *      Time Complexity - O(logn)
         *      Space Complexity - O(1)
         */

    }
}