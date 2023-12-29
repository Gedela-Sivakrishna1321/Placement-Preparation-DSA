public class Question2 {
    
    public static int sumOfElements(int matrix[][]) {
        int m = matrix[0].length;
        int sum = 0;
        for(int j=0; j<m; j++) {
            sum += matrix[1][j];
        }
        return sum;
    }
    public static void main(String[] args) {
        
        int matrix[][] = {{1,4,9},
                          {11,4,3},
                          {2,2,3}};
        System.out.println("Sum of Elements in 2nd Row of Matrix - " + sumOfElements(matrix));
    }
}
