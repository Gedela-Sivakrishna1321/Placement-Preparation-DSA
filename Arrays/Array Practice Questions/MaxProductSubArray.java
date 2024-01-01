public class MaxProductSubArray {
    
    public static int maxProduct(int arr[]) {

        int max_Product = Integer.MIN_VALUE;
        int product = 1;

        // Product from Left ---> Right
        for(int i=0; i<arr.length; i++) {
            product *= arr[i];
            max_Product = Math.max(max_Product, product);

            if(product == 0) {
                product = 1;
            }
        }

        product = 1;
        // Product from Right ---> Left
        for(int i = arr.length - 1; i>=0; i--) {
            product *= arr[i];
            max_Product = Math.max(max_Product, product);

            if(product == 0) {
                product = 1;
            }
        }
        return max_Product;
    }

    public static void main(String[] args) {
        
        int arr[] = {-3, -2, -1, 5, 10};
        System.out.println("Max Product - " + maxProduct(arr));

        /*      Approach :- 
         *          1) Declare a maxProduct variable to store the max product and
         *          initialize product variable to 1
         *          2) Calculate product from Left ---> Right, If any where product becomes zero then make it 1
         *          3) Now, reinitialize product to 1 
         *          4) Calculate product from Right ---> Left, if any where product becomes zero then make it 1
         * 
         *      Complexities :- 
         *          Time Complexities - O(n), Space Complexity - O(1)
         */
    }
}
