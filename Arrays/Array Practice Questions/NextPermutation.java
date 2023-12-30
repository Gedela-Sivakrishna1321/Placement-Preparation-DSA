import java.util.Arrays;

public class NextPermutation {

    public static void print(int arr[]) {
        for(int elem : arr) 
            System.out.print(elem + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        
        int arr[] = {4,1,5,3,2};
        print(arr);
        int n = arr.length;
        int idx1 = -1;
        // Step 1 - Find the value of idx1
        for(int i = n-2; i >= 0; i-- ) {
            if(arr[i] < arr[i+1]) {
                idx1 = i;
                break;
            }
        }

        if(idx1 == -1) {  // Array is in descending order
            Arrays.sort(arr);
        } else {
            int idx2 = 0;
            // Step 2 - Find the value of idx2
            for(int i = n-1; i>=0; i--) {
                if(arr[i] > arr[idx1]) {
                    idx2 = i;
                    break;
                }
            }

            // Step 3 - Swap the elements at idx1 & idx2
            int temp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = temp;

            // Step 4 - Sort the array from idx1 + 1 to n
            Arrays.sort(arr, idx1+1, n);
            System.out.println("-----------------------------");
            print(arr);

            /*
             *      Time Complexity - O(N(Log N)), Space Complexity - O(1) 
             * 
             *      Note :- If the next greatest permutation doesn't exist then return the first permutation 
             */
        }

    }
}