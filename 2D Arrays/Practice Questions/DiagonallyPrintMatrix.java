public class DiagonallyPrintMatrix {

    //    Time Complexity - O(n*m)
    public static void printMatrixDiagonally(int matrix[][]) {
        int N = matrix.length;
      

        // Print Upper Triangle
        for(int k=0; k < N; k++) {
            int row = k, col = 0;
            // Run till row >= 0
            while(row >= 0) {
                System.out.print(matrix[row][col] + " ");
                row--;
                col++;
            }
            System.out.println();
        }
    
        // Print Lower Triangle
        for(int k=1; k<N; k++) {
            int row = N-1, col = k;
            while(col < N) {
                System.out.print(matrix[row][col] + " " );
                row--;
                col++;
            }
            System.out.println();
        }

    }

    public static void print(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) 
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    //    Time Complexity - O(n*m)
   public static void printMatrixAntiDiagonally(int matrix[][]) {
       int N = matrix.length;

       // Print the upper triangle
      for(int k=0; k<N; k++) {
          int col = k, row = 0;
          while(col >= 0) {
            System.out.print(matrix[row][col] + " ");
            row++;
            col--;
          }
          System.out.println();
      }

      // Print the Lower triangle
      for(int k = 1; k<N; k++) {
          int row = k, col = N-1;
          while(row < N) {
            System.out.print(matrix[row][col] + " ");
            row++;
            col--;
          }
          System.out.println();
      }

   }
   
    public static void main(String[] args) {
        
        // Note :- Matrix must be a square matrix
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        print(matrix);
        System.out.println("---------------------------------");
        printMatrixDiagonally(matrix);
        System.out.println("---------------------------------");
        printMatrixAntiDiagonally(matrix);

        /*     Approach 1:- Print Diagonally 
         *         1) To Print upper triangle, Run a for loop from k = 0 to N
         *         2) Initialize the variables row = k, col = 0
         *         3) Run a nested while loop, till the condition row >= 0
         *              while(row >= 0) {
         *                  print Matrix[row][col];
         *                  row--;
         *                  col++;
         *              }
         *         4) To Print Lower triangle, Run a loop from k = 1 to N
         *         5) Initialize the variables row = N-1, col = k
         *         6) Run a nested while loop, till col < N
         *              while(col < N) {
         *                  print Matrix[row][col];
         *                  row--;
         *                  col++;
         *              }
         *       
         *      Complexities :- 
         *          Time Complexity - O(n*m) -> Because the maximum diagonals in a square matrix = n + m - 1
         */

    }
}