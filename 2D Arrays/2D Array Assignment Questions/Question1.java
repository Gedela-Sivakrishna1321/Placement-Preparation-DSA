
public class Question1 {

    public static int numberOfSevensLinearSearch(int matrix[][]) {
        int count = 0;
        int n = matrix.length, m = matrix[0].length;
        for(int i=0; i < n; i++ ) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == 7)
                    count++;
            }
        }
        return count++;
    }
   

    public static void main(String args[]) {

        int matrix[][] = {{4,7,8},
                          {8,8,7}};
        System.out.println("Number of 7's - " + numberOfSevensLinearSearch(matrix));
    }
}