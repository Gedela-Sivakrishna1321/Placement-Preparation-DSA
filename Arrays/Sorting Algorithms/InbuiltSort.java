import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {

    public static void printArray(Integer arr[]) {
        for(int elem : arr)
            System.out.print(elem + " ");
        System.out.println();
        }
    
    public static void main(String[] args) {
        Integer arr[] = {5,4,1,3,2};
        // ------------------- Ascending Order ------------------
        Arrays.sort(arr);
        printArray(arr);
      
        Arrays.sort(arr, 0, 4);
        printArray(arr);
       
        // -------------------- Descending Order -----------------
       Arrays.sort(arr,2,5, Collections.reverseOrder());
        printArray(arr);

        /*
         *      Complexities :- 
         *          Time Complexity - O(nlogn)
         */
    }
}
