public class DiagonalSum {

    public static int diagonalSum(int matrix[][]) {

        int sum = 0;
        for(int i=0; i<matrix.length; i++) {
            // Primary Diagonal Sum
            sum += matrix[i][i];
            // Secondary Diagonal Sum
            if(i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static void print(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int matrix[][] = {{1,2,3,4},
                         {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        print(matrix);
        System.out.println("Diagonal Sum = " + diagonalSum(matrix));

        /*     Approach :-  
         *          1) Declare a sum variable
         *          2) Run a loop from i = 0 to i < matrix.length
         *          3) Calculate the primary diagonal sum by -> sum += matrix[i][i]
         *          4) Calculate the secondary diagonal sum by 
         *                          -> sum += matrix[i][n-1-i]
         *          5) Since for n == m == odd, there will be an overlapping element. 
         *             So the secondary diagonal sum should be calculated under this 
         *             condition - if(i != n-1-i) to avoid the addition of the 
         *             overlapping element to the sum
         * 
         *      conditions :- 
         *                 [1, 2, 3]        Primary Diagonal   :- i == j
         *                 [4, 5, 6]        Secondary Diagonal :- i + j = n - 1
         *                 [7, 8, 9]
         *                         3*3 Matrix
         * 
         *      Complexities :- 
         *          Time Complexity - O(n), Space Complexity - O(1)
         */
    }
}