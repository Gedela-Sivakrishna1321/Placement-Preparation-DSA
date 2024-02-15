package Classroom;

public class GridWays {

    public static int countWays(int i, int j, int n, int m) {
        // Base case
        if(i == n-1 && j == m-1) {
            return 1;
        } 
        else if (i == n || j == m) {
            return 0;
        }

        // Right ways
        int rightWays = countWays(i, j+1, n, m);
        int downWays = countWays(i+1, j, n, m);

        return rightWays + downWays;
    }

    // Time Complexity - O(n + m)
    public static long linearWay(int n, int m) {
        // Formula - (n-1 + m-1)! / {(n-1)! * (m-1)!}
        return fact(n-1+m-1)/(fact(n-1) * fact(m-1));
    }

    public static long fact(int n) {
        // Base case
        if(n == 1) {
            return 1;
        }
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        
        int n = 3, m = 3;
        System.out.println(countWays(0,0,n,m));
        System.out.println(linearWay(n, m));

        /*  
         *      Backtracking Approach :- Time Complexity O(2^m+n)
         *      Permutation Approach :- Time Complexity O(n+m)
         */
    }
}