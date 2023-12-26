public class SearchInRotatedArray {
    
    public static int searchInRotatedArray(int nums[], int target) {
      
        int startIdx = 0;

        for(int i=0; i<nums.length-1; i++) {
            if(nums[i+1] < nums[i]){
                startIdx = i+1;
                break;
            }
        }
        
        int start,end;
        if(nums[startIdx] == target) {
            return startIdx;
        }
        else if (nums[nums.length - 1] == target)

        while(start <= end) {

            int mid = start + (end - start)/2;

            if(nums[mid] == target) {
                return mid;
            }

            if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int BinarySearch(int nums[], int target) {
        int start = 0, end = nums.length - 1;

        while(start <= end) {

            int mid = start + (end - start)/2;

            if(nums[mid] == target) {
                return mid;
            }

            if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
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
