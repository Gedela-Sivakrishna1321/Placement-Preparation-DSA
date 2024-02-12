package Classroom;

public class ArrayOperation {

    public static void changeArr(int arr[], int i, int val) {
        // Base Case
        if(i == arr.length) {
            printArr(arr);
            return;
        }

        // Logic
        arr[i] = val;

        // Recursive call
        changeArr(arr, i+1, val+1);

        // Backtracking step -> The steps performed after coming backing from base case to main function
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) 
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }

}