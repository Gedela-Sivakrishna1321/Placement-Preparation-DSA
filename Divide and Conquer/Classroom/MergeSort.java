public class MergeSort {

    public static void mergeSort(int arr[], int si, int ei) {
        // Base case
        if(si >= ei) {
            return;
        }

        // Logic 
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // Iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp array

        // Start comparing the left & right arrays
        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy the leftover elements
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the temp array elements to original array
        for(k=0, i = si; k<temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void print(int arr[]) {
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,6,3,9,5,2,8};
        print(arr);
        mergeSort(arr, 3, arr.length-1);
        print(arr);

        /*      Approach :- 
         *          1) Divide the array 
         *          2) Recursively call the mergeSort for left & right parts
         *              mergeSort(arr, si, mid)
         *              mergeSort(arr, mid+1, ei)
         *          3) merge the left & right arrays
         * 
         *      Complexities :- 
         *          Time Complexity - O(nlogN)
         *          Space Complexity - O(n) --> Because we are using temp array
         */
    }
}