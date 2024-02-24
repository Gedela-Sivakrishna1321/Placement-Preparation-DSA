package Classroom;

public class RatInMaze {

    public static void printSolution(int sol[][]) {
        for(int i=0; i<sol.length; i++) {
            for(int j=0; j<sol[0].length; j++)
                System.out.print(sol[i][j] + " ");
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][], int i, int j) {
        // A cell is valid if all the below conditions are true
        return i >=0 && i <= maze.length-1 && j >= 0 && j <= maze.length-1 && maze[i][j] == 1;
    }

    public static boolean solveMaze(int maze[][]) {
        int N = maze.length;
        int sol[][] = new int[N][N];
        if(!solveMazeUtil(maze, 0, 0, sol)) {
            System.out.println("Solution doesn't exist ..!");
            return false;
        }
        
        printSolution(sol);
        return true;
    }

    public static boolean solveMazeUtil(int maze[][], int i, int j, int sol[][]) {
        // Base case

        
        if(i == maze.length-1 && j == maze[0].length-1 && maze[i][j] == 1) {
            sol[i][j] = 1;
            return true;
        }

        // Check for remaining cells
        if(isSafe(maze, i, j)) {
            if(sol[i][j] == 1)
                return false;
            sol[i][j] = 1;

            // Check for the next cell in row
            if(solveMazeUtil(maze, i+1, j, sol)) {
                return true;
            }

            // Check for the next cell in column
            if(solveMazeUtil(maze, i, j+1, sol)) {
                return true;
            }

            sol[i][j] = 0;
            return false;
        }

        return false;
    }

    public static void main(String[] args) {
        
        // int maze[][] = {{1, 0, 0, 0},
        //                 {1, 1, 0, 1},
        //                 {0, 1, 0, 0},
        //                 {1, 1, 1, 1}};

        int maze[][] = {{1, 1, 0, 0},
                        {0, 0, 0, 1},
                        {1, 1, 0, 0},
                        {1, 1, 1, 1}};
        
        solveMaze(maze);
    }
    
}
