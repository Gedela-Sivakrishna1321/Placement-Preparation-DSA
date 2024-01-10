public class RotateImage {

    // Time Complexity - O(m*n), Space Complexity - O(m*n)
    public static int[][] rotate(int matrix[][]) { 
        // Store the dimensions of matrix
        int n = matrix.length;

        // Declare a 2D Matrix of size n*n
        int grid[][] = new int[n][n];

        // Loop through the matrix row wise,    // Store the row elements in the end col of matrix and so on..
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                grid[j][n-1-i] = matrix[i][j]; 
            }
        }
        
        return grid;
    }

//  Time Complexity - O(m*n), Space Complexity - O(1)
    public static void rotateOptimised(int matrix[][]) {
        int n = matrix.length;
        
        // Transpose the Matrix
        for(int i=0; i<n; i++) {
            for(int j= i +1; j<n; j++) {
                // Swap the elements
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
                
        }
        
        // Swap the row elements
        for(int i=0; i<n; i++) {
            int left = 0; 
            int right = n-1;
            while(left < right) {
                // Swapping the elements present at left position with element at right position
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;

            } 
        }
    }



    public static void print(int matrix[][]) {
       
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    
    }

    public static void main(String[] args) {
        
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        print(matrix);
        System.out.println("=======================================");
        // print(rotate(matrix));

        rotateOptimised(matrix);
        print(matrix);

        /*      Naive Approach :- 
         *          1) Declare a 2D array 
         *          2) Traverse the matrix and store the elements of matrix[i][j] at arr[j][i]
         * 
         *      Complexities :- 
         *          Time Complexity - O(m*n), Space Complexity - O(m*n) - Because 2D array is used
         * 
         *      Optimised Approach :-
         *          1) Transpose the matrix in place
         *          2) Now, Reverse the elements in each row of the matrix
         * 
         *      Complexities :-
         *          Time Complexity - O(m*n), Space Complexity - O(1)
         */
    }
}