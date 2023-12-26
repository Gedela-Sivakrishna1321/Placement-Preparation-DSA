public class Question1 {
    
    public static boolean isDuplicatesExist(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println("Duplicates Exist = " + isDuplicatesExist(nums));
        /*
         *      Approach :- 
         *          1) Run an outer loop, which runs from i=0 to array length
         *          2) Run inner loop from i+1 to array length and check the condition
         *                 if(element at i == element at i+1) then return true because 
         *             Duplicate element is found
         *              or else return false
         * 
         *      Complexities :- 
         *          1) Time Complexity :- O(n^2)
         *          2) Space Complexity :- O(1) 
         */
    }
}