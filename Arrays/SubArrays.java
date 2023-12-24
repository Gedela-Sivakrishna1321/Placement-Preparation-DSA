public class SubArrays {

    public static void printSubarrays(int numbers[]) {

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        
        for(int i=0; i<numbers.length; i++) { // Time Complexity :- O(n^3), space complexity = O(1)
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                int sum = 0;
                for(int k = start; k<=end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }
                max = Math.max(max, sum);
                min = Math.min(min, sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max sub array sum - " + max);
        System.out.println("MIn Subarraya Sum - " + min);
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12};
        printSubarrays(numbers);
       
        // Formula to calculate total number of sub arrays
        /*  
           If n be length of array 
           Total number of sub arrays = n*(n+1)/2
         */

         /*
               Time Complexity - O(n^3)
               Space Complexity - O(1)
          */

    }
    
}
