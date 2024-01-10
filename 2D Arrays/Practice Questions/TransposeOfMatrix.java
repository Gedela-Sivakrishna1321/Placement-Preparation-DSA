public class TransposeOfMatrix {
    
    // Time Complexity - O(m*n), Space Complexity - O(1)
    public static void transpose(int matrix[][]) {

        for(int i=0; i<matrix.length; i++) {
            // Start J from i + 1, orelse the elements gets swapped twice and looks as the initial matrix
            for(int j=i+1; j< matrix[0].length; j++) {
              
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            
            }
        }
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
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        print(matrix);
        System.out.println("===============================");
        transpose(matrix);
        print(matrix);
    }
}
