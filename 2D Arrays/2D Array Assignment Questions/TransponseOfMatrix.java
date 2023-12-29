public class TransponseOfMatrix {
    
    public static int[][] transposeOfMatrix(int matrix[][]) {
        int n = matrix.length, m = matrix[0].length;
        int transposeMatrix[][] = new int[m][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }

    public static void print(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) 
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String args[]) {

        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        print(matrix);
       
        System.out.println("-------------------------------------");
        print( transposeOfMatrix(matrix));

        /*      Approach :-  n*m are the Dimensions of Original Matrix
         *          1) Declare a transponseMatrix of size - [m][n]
         *          2) Run a loop and copy the elements from original matrix to the transponse matrix
         * 
         *     Complexities :- 
         *          Time Complexity - O(n^2), Space Complexity - O(m*n) because we are declaring another matrix
         */
    }
}
