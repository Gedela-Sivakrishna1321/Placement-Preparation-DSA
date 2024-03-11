package Arrays;
import java.util.Arrays;

public class ChoclateDistibutionProblem {

    // Time Complexity - O(nlogn)
    // Space Complexity - O(1)
    public static int choclateDistribution(int arr[], int m) {

        if(arr.length == 0 || m == 0) {
            return -1;
        }

        // Sort the Array
        Arrays.sort(arr);

        int min_diff = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {

            // Ending index of the window
            int nextWindow = i + m - 1;

            if(nextWindow >= arr.length) {
                break;
            }

            // Difference b/w the maximum & minimum choclates
            int diff = arr[nextWindow] - arr[i];

            // Update min_difference
            min_diff = Math.min(diff, min_diff);

        }

        return min_diff;
    }


    public static void main(String[] args) {

        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;

        System.out.println(choclateDistribution(arr, m));


    }
}