public class MInMaxElementOfArray {

    public static int[] minMaxOfArray(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }

        int vals[] = {min, max};
        return vals;
    }

    public static void main(String[] args) {
        int arr[] = {242,232,234,228,225,194};
        int vals[] = minMaxOfArray(arr);
        System.out.println("Minimum element - " + vals[0]);
        System.out.println("Maximun Element - " + vals[1]);

        /*
         *      Approach :- 
         *             Initialize min and max variables and Loop through the array and find out the 
         *              min and max element of the array.
         *      
         *      Complexities :- 
         *          Time Complexity - O(n), Space Complexity - O(1)
         */
    }
}