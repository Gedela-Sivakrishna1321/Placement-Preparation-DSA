package Arrays;
import java.util.Arrays;

public class NextPermutation {

    public static void nextPermutation(int arr[]) {

        // Find the breaking point and break from loop
        int breakingPoint = -1;
        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                breakingPoint = i;
                break;
            }
        }

        // Check if breaking point exists
        if(breakingPoint == -1) {
            Arrays.sort(arr);
        } 
        else {

            // Now, Find the element greater then element at breaking point from backwards of array
            int nextGreatest = -1;
            for(int i = arr.length - 1; i > breakingPoint; i--) {
                if(arr[i] > arr[breakingPoint]) {
                    nextGreatest = arr[i];
                    break;
                }
            }
    
            // After find the nextGreatest, swap breakingPoint element & nextGreatest
            int temp = arr[breakingPoint];
            arr[breakingPoint] = nextGreatest;
            nextGreatest = temp;
    
            // Sort the right part of breaking point
            Arrays.sort(arr, breakingPoint, arr.length);
        }

    }

    

    public static void main(String[] args) {
        
        int arr[] = {2, 1, 3, 4};
    }
    
}
