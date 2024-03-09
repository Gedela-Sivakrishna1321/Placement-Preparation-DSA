package Arrays;

public class ReverseArray {

    // Time Complexity - O(n), Space Complexity - O(1)
    public static void twoPointerApproach(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            // Standard way to swap 2 variables
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void recursiveApproach(int arr[], int start, int end) {
        // Base case
        if(start >= end) {
            return;
        }

        // Work
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call
        recursiveApproach(arr, start+1, end-1);
    }

    public static void print(int arr[]) {
        for(int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9};
        print(arr);
        // twoPointerApproach(arr);
        recursiveApproach(arr, 0, arr.length-1);
        print(arr);
    }
    
}
