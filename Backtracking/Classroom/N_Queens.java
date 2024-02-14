package Classroom;

public class N_Queens {

    public static boolean isSafe(char[][] board, int row, int col) {

        // Vertically up
        for(int i = row - 1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        // Diag left up
        for(int i = row-1, j = col - 1; i>=0 && j >= 0 ; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        // Diag right up
        for(int i = row-1, j = col+1; i>=0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueens(char[][] board, int row) {

        // Base case
        if(row == board.length) {
            // printBoard(board);
            count++;
            return true;
        }

        // loop column 
        for(int j=0; j<board.length; j++) {
           
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if( nQueens(board, row+1)) {
                    return true;
                }
                board[row][j] = 'X';
            }
        
        }

        return false;
    }

    public static void printBoard(char[][] board) {
        System.out.println("-------------- Chess Board ------------------------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

        static int count = 0;
    public static void main(String[] args) {
        
        int n = 4;
        char[][] board = new char[n][n];

        // Initilization
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                board[i][j] = 'X';
            }
        }

        if(nQueens(board, 0)) {
            System.out.println("Solution is possible ");
            printBoard(board);
        } else {
            System.out.println("Solution is not possible");
        }
        // System.out.println("Total n.o of ways - " + count);
        /*  
         *      Classical Problem of backtracking concept
         *      
         *      Time Complexity :- O(n !)
         *      
         *      Recurrance Relation :- T(n) = n * T(n-1) + isSafe() 
         * 
         *      To count the number of ways -> initialize the static count variable and increment it every time the 
         *      base case is hit.
         */
    }
}