public class SearchInRotatedArray {

    // Divide & conquer approach
    public static int search(int arr[], int si, int ei, int target) {

        // Base case
        if(si > ei) {
            return -1;
        }


        // Logic
        int mid = si + (ei - si)/2;

        if(arr[mid] == target) {
            return mid;
        }

        // Mid Lies on Line 1 
        if(arr[si] <= arr[mid]) {
            // case a :
            if(arr[si] <= target && target < arr[mid]) {
               return search(arr, si, mid-1, target);
            } else { // case b :
               return search(arr, mid+1, ei, target);
            }
        } 
        else {   // MId Lies on Line 2
            // case c : 
            if(arr[mid] <= target && target <= arr[ei]) { 
               return search(arr, mid+1, ei, target);
            } else { // case d :
               return search(arr, si, mid-1, target);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0, arr.length-1, 4));

        /*  -----> This approach is also known as modified binary search
         *      Time Complexity - O(Log N) 
         */
    }
}