public class SearchInSortedMatrix {
    
    public static boolean stairCaseSearch(int matrix[][], int key) {
        int n = matrix.length, m = matrix[0].length;
        int endRow = n-1, startCol = 0;

        while(endRow >= 0 && startCol < m ) {
            int currCellVal = matrix[endRow][startCol];
           
            if(key == currCellVal) {
                System.out.println("Key found at " + "("+endRow+","+startCol+")");
                return true;
            }
            else if (key < currCellVal) {
                endRow--;
            } else {
                startCol++;
            }
        }

        System.out.println("Key not found!");
        return false;
    }

    public static void main(String[] args) {
        
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        stairCaseSearch(matrix, 30);

        /*     Approach :- Matrix Dimensions (n*m)
         *          1) Declare two variables startRow = 0 and endCol = m - 1
         *          2) Run a while loop till the following condition is true
         *             condition -> (startRow < n && endCol >= 0)
         *          3) if ( key == currentElement) then return index
         *          4) else if (key < currentElement) then endCol -- 
         *          5) else if (key > currentElement) then startRow++
         *    
         *     Note :- This approach is known as staircase search, where we start searching from 
         *             one corner of matrix. We can start from either corner ( Top Right or Bottom Left )
         * 
         *     Time Complexities :- 
         *          1) Brute Force -> O(n^2)
         *          2) Binary search in each row -> O(N(log N)) 
         *          3) Staircase search -> O(n + m)    
         * 
         */
    }
}
