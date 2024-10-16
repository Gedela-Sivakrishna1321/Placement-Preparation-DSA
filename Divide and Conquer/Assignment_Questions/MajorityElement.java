public class MajorityElement {
    
    public static int majorityElement(int arr[], int count[], int i) {
        // Base case
        if(i == arr.length) {
            return 0;
        }

        // Logic
        count[arr[i]]++;
        
        

        // Recursive call
        majorityElement(arr, count, i+1);

        if(count[i] > arr.length/2) {
            return i;
        }
        return -1;
    }

    // Iterative Approach
    public static int majorityElement(int arr[] ) {

        int largest = Integer.MIN_VALUE;

        for(int elem : arr)
            largest = Math.max(largest, elem);
        
        int count[] = new int[largest+1];

        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        for(int i=0; i<count.length; i++) {
            if(count[i] > arr.length/2) {
                return i;
            }
        }

        return -1;

    }

    // Brute Force Approach
    public static int majorityElementBruteForce(int arr[] ) {

        int majorityCount = arr.length / 2;

        for(int i=0; i<arr.length; i++) {
            int count = 0;
            for(int j=0; j<arr.length; j++) {

                if(arr[j] == arr[i]) {
                    count++;
                }
            }

            if(count > majorityCount) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2,1};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElementBruteForce(nums));
    }
}
