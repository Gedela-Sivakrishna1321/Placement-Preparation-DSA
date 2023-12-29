public class SearchInRotatedArray {
    
    public static int searchInRotatedArray(int nums[], int key) {
        int n = nums.length;
        int start = 0, end = n-1;
        
        while(start <= end) {
            int mid = start + (end - start)/2;

            if(nums[mid] == key)
                return mid;

            if(nums[start] < nums[mid]) { // Left Part sorted
                
                if(nums[start] <= key && key < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // Right Part sorted

                if(nums[mid] < key && key <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            
        }
       return -1;
    }

   
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2, 3};
        int target = 0;
        System.out.println("Target Value 0 = " + searchInRotatedArray(nums, target));
    }
}
