public class ProductExceptSelf {

    // Approach 1 --> Time Complexity - O(n), Space Complexity - O(n)
    public static int[] approach1(int arr[]) {
        int n = arr.length;
        // Array to store the output result
        int op[] = new int[n];

        // Calculate the leftProduct
        int leftProduct[] = new int[n];
        leftProduct[0] = arr[0];
        for(int i=1; i<n; i++) {
            leftProduct[i] = arr[i] * leftProduct[i-1];
        }

        // Calculate the rightProduct
        int rightProduct[] = new int[n];
        rightProduct[n-1] = arr[n-1];
        for(int i=n-2; i>= 0; i--) {
            rightProduct[i] = arr[i] * rightProduct[i+1];
        }

        // Calculate the final Output
        // Store the result of boundary elements
        op[0] = rightProduct[1];
        op[n-1] = leftProduct[n-2];

        for(int i=1; i < n-1; i++) {
            op[i] = leftProduct[i-1] * rightProduct[i+1];
        }
        return op;
    }
   
    // Approach 2 --> Time Complexity - O(n), Space Complexity - O(1)
    public static int[] optimisedApproach(int arr[]) {
        int n = arr.length;
        // Array to store the output result
        int op[] = new int[n];

        // Calculate the cumilative product of left elements
        op[0] = arr[0];
        for(int i=1; i<n; i++) {
            op[i] = arr[i] * op[i-1];
        }

        // Product Variable to keep track of cumilative product of right elements
        int product = arr[n-1]; 

        // Storing the boundary elements value
        op[n-1] = op[n-2];

        // Now calculate the final output
        for(int i = n-2; i >= 0; i--) {
            
            if(i == 0) {
                op[i] = product;
            } else {
                 op[i] = op[i-1] * product;
            }

            product *= arr[i];
        }
        return op;
    }
    
    public static void print(int arr[]) {
           for(int elem : arr)
            System.out.print(elem + " ");
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4};
        int op[] = approach1(arr);
        print(op);
        int op2[] = optimisedApproach(arr);
        print(op2);

        /*      Approach 1 
         *      1) Declare a output array to store the result
         *      2) Calculate & store the cumilative product of left elements in leftProduct[]
         *      3) Similarly, store the cumilative product of right elements in rightProduct[]
         *      // Store the values of boundary elements like i == 0 & i == n-1
         *         op[0] = rightProduct[2]
         *         op[n-1] = leftProduct[n-2]
         *      4) Now, Run a loop & calculate the product by - op[i] = leftProduct[i-1] * rightProduct[i+1]
         * 
         *      Complexities :- 
         *          Time Complexity - O(n), Space Complexity - O(n) because we are using two auxilary arrays 
         *          to store the cumilative product
         * 
         *      Approach 2 
         *      1) Declare a output array to store the result
         *      2) Calculate & store the cumilative product of left elements in output array
         *      3) Initialize a Product variable to store the cumilative product of left elements
         *      4) Store the output of boundary elements
         *          op[n-1] = op[n-2]
         *      5) Run a loop and calculate the product
         *          for i == 0 , op[0] = product
         *          for remaining elements -> op[i] = op[i-1] * product
         *          After each each iteration , product *= arr[i]
         * 
         *      Complexities :-
         *          Time Complexity - O(n), Space Complexity - O(1)
         * 
         *      Note :- output array is not calculated for space complexity as mentioned in the question 
         */

    }
}