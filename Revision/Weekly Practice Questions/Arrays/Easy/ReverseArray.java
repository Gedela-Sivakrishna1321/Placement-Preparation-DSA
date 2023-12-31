package Arrays.Easy;

public class ReverseArray {

    public static void reverseArray(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            // Swap the left &  right values of the array
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Update left & right pointer
            left++;
            right--;
        } 
    }

    public static void print(int arr[]) {
        for(int elem : arr)
            System.out.print(elem + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        print(arr);
        reverseArray(arr);
        print(arr);
        
        /*      Approach :-              
         *          1) Declare two pointers, left & right where left = 0 & right = n - 1
         *          2) Run the loop until (left < right) 
         *          3) Swap the left and right values and update the left & right pointers
         * 
         *      Complexitites :- 
         *          Time Complexity - O(n), Space Complexity - O(1)
         * 
         *      Note :- Array is passed by reference to a function so change in values get reflected in the 
         *      original array whereas primitive data types are called by value. -> changes doesn't get reflected here
         */
    }
    
}
