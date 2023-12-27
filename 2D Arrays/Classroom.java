import java.util.Scanner;
public class Classroom {

    public static void print(int matrix[][]) {
        // Row length
        int n = matrix.length;
        // Column Length
        int m = matrix[0].length;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static boolean search(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Key found at index = " + "("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    } 
   
    public static void minAndMaxofMatrix(int matrix[][]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int n = matrix.length, m = matrix[0].length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                min = Math.min(min, matrix[i][j]);
                max = Math.max(max, matrix[i][j]);
            }
        }

        System.out.println("Minimum Value of Matrix = " + min);
        System.out.println("Maximum value of Matrix = " + max);
    }
    public static void main(String[] args) {
        // Declaring a 2D array
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        print(matrix);
        search(matrix, 228);
        minAndMaxofMatrix(matrix);
    }
}