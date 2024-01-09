public class SetMatrixZero {

    // There is a loop hole in this Approach
    public static void setZeros(int matrix[][]) {
        // Calculate the dimensions of the matrix
        int m = matrix.length; // Row Length
        int n = matrix[0].length; // Column Length

        // Declare two array row & col of size m , n
        int row[] = new int[m];
        int col[] = new int[n]; // I think, I need to use ArrayList Instead of Arrays

        // Variables to track the index of row & col array
        int rowIdx = 0;
        int colIdx = 0;

        // Loop through the matrix and wherever '0' is encountered store the respective cell index 
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    row[rowIdx++] = i;
                    col[colIdx++] = j; 
                }
            }
        }

        // Loop through the row & mark the necessary elements zero in the matrix
        for(int i=0; i<row.length; i++) {
            rowIdx = row[i];
           
                for(int j = 0; j<n; j++)
                    matrix[rowIdx][j] = 0;
            
           

        }

        // Similarly, do the same for col & mark the necessary elements zero in the matrix
        for(int j=0; j<col.length; j++) {
            colIdx = col[j];

            for(int i=0; i<m; i++) 
                matrix[i][colIdx] = 0;
        }
    }

    // Best Approach  -> Space Complexity - O(1), Time Complexity - O(m*n)
    public static void setZerosOptimised(int matrix[][]) {
        
        // Store the dimesnsions
        int m = matrix.length;
        int n = matrix[0].length;

        // Declare two variables x & y to track the zeros present in 1st row & 1st col
        int x = 1;
        int y = 1;

        // Loop through the 1st row, and if zero is encountered then set x = 0, break from the loop
        for(int j=0; j<n; j++) {
            if(matrix[0][j] == 0) {
                x = 0;
                break;
            }
        }

        // Similarly, do the same for 1st col & if zero is encountered set y = 0, break from loop
        for(int i=0; i<m; i++) {
            if(matrix[i][0] == 0) {
                y = 0;
                break;
            }
        }

        // Loop through the matrix from i = 1 to m & j = 1 to n and if m[i][j] = 0, then set corresponding
        // element in 1st Row & 1st Col to -> m[i][0] = 0 && m[0][j] = 0
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Loop through the 1st row of matrix & if zero is encountered then mark the entire column with 0
        for(int j=0; j<n; j++) {
            if(matrix[0][j] == 0) {
                for(int i=0; i<m; i++)
                    matrix[i][j] = 0;
            }
        }

        // Same thing for 1st col of matrix
        for(int i=0; i<m; i++) {
            if(matrix[i][0] == 0) {
                for(int j=0; j<n; j++) 
                    matrix[i][j] = 0;
            }
        }

        // check if (x == 0) then mark 1st row with zeros
        if(x == 0) {
            for(int j=0; j<n; j++)
                matrix[0][j] = 0;
        }

        // Check if(y == 0) then mark the 1st column with zeros
        if(y == 0) {
            for(int i=0; i<m; i++) 
                matrix[i][0] = 0;
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
        int matrix[][] = {{1,1,0,1},
                          {0,1,1,1},
                          {1,0,1,1},
                          {1,1,1,1}};
        
        int matrix2[][] = {{1,1,1},
                           {1,0,1},
                           {1,1,1}};

        print(matrix2);
        // setZeros(matrix2);
        setZerosOptimised(matrix2);
        System.out.println("-------------------------------------------------");
        print(matrix2);
    }
}