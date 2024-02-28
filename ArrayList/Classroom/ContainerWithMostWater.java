package Classroom;
import java.util.ArrayList;
import java.util.Collections;

public class ContainerWithMostWater {

    // Time Complexity - O(n^2) - Brute Force 
    public static int containerWithMostWater(ArrayList<Integer> heights) {

        int len = heights.size();

        // Variable to store maxContainedWater
        int maxContainedWater = Integer.MIN_VALUE;

        for(int i=0; i<len-1; i++) {
            for(int j = i+1; j < len; j++) {
                int height = Math.min(heights.get(i),heights.get(j));
                int width = j - i;
                int containedWater = height * width;
                // System.out.print(containedWater + ", ");
                maxContainedWater = Math.max(maxContainedWater, containedWater);
            }
            // System.out.println();
        }

       return maxContainedWater;
    }

    // Time Complexity - O(n) - Linear Time 
    public static int optimisedContainerWithMostWater(ArrayList<Integer> heights) {
        int maxWater = 0;
        int left = 0;
        int right = heights.size()-1;

        while(left < right) {
            int height = Math.min(heights.get(left), heights.get(right));
            int width = right - left;

            int currWater = height * width;

            maxWater = Math.max(maxWater, currWater);

            if(heights.get(left) < heights.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> heights = new ArrayList<Integer>(); 

       
        /*    ArrayList<Integer> heights = new ArrayList<Integer>(); 
         *                      v/s
         *    ArrayList<Integer> heights = new ArrayList<>();
         * 
         *      Both of the above syntax creates an Integer ArrayList. No difference at all. After Java 7 version
         *      people started using 2nd syntax, java automatically assumes it.  
          */

        Collections.addAll(heights, 1, 8, 6, 2, 5, 4, 8, 3, 7);

        // int maxContainedWater = containerWithMostWater(heights);

        // System.out.println("Max Water can be stored = " + maxContainedWater);
        System.out.println("Max Water can be stored = " + optimisedContainerWithMostWater(heights));


        /*      Explination :-  2 Pointer Approach
                    
                    i) Declare two pointers left and right. Initialize left pointer with 0 index and 
                    right pointer with n-1 index values. And also maxWater variable to store the maximum 
                    water. Initialize it with 0.
                    
                    ii) Now, Iterate till left pointer is less than right pointer
                        while(left < right) {
                             current height = which is the minimum height of height stored at 
                                               left and right pointers.
                              Current width = the difference b/w the right and left pointer
                              currentWater = Multiply height and width 
                              Now Update maxWater
                              maxWater = Math.max(maxWater, currentWater)
                        }

         * 
         */
    }
    
}
