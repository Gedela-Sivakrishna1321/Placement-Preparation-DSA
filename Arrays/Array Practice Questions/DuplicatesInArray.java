import java.util.Arrays;

public class DuplicatesInArray {
   
    public static boolean isDuplicateExist(int nums[]) {
        Arrays.sort(nums);

        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {2,3,4,5,1,2,3,6,7,8,9};
        System.out.println("Duplicates exist in Array - " + isDuplicateExist(nums));

        /*
         *         Approach :- 
         *              Sort the array and loop through the array from index i = 1 to n, 
         *              now compare if (arr[i] == arr[i-1]) then return true as we found duplicate element
         *              else return false
         * 
         *         Complexities :- 
         *              Time Complexity - O(nlogn), Space Complexity - O(1)
         */
    }
}