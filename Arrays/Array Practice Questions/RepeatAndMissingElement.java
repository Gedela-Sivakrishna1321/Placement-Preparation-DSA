public class RepeatAndMissingElement {

    public static int[] repeatAndMissingElement(int arr[]) {
        // Array to store the result
        int ans[] = new int[2];
        // Loop to find out the repeating element
        for(int i=0; i<arr.length; i++) {
            int idx = Math.abs(arr[i])-1;
            if(arr[idx] < 0) { // Number repeating condition
                ans[0] = idx + 1;
            } else {
                arr[idx] *= -1;
            }
        }

        // Loop to find out the missing element
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 0) {
                ans[1] = i+1;
                break;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,2,5,2};
        int ans[] = repeatAndMissingElement(arr);
        System.out.println("Repetating element = " + ans[0] + ", Missing Element = " + ans[1]);

        /*   Approach :- 
         *        1) Declare a ans array of size[2] to store the answer
         *        2) Loop through the array to find the repeatative element by their indices
         *        3) Find the idx by --> idx =  Math.abs(arr[i]) - 1, absolute value is taken because
         *           the element may be nagative.
         *        4) if(arr[idx] < 0) then ans[0] = idx + 1 
         *           else arr[idx] *= -1 // Mark the elements Nagative
         *        5) Run another loop to find out the missing element
         *           if(arr[i] > 0) {
         *              ans[1] = i+1;
         *              }
         * 
         *      Complexities :- 
         *          Time Complexity - O(n), Space Complexity - O(1)
         */
    }
}