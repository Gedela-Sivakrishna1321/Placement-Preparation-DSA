public class SmallestInArray {
    
    public static int smallestElement(int arr[], int i, int min) {
        // Base case
        if(i == arr.length) {
            return min;
        }

        // Logic
        min = Math.min(arr[i], min);

        return smallestElement(arr, i+1, min);
    }
    public static void main(String[] args) {
        int arr[] = {6,2,5,6,8,9};
        System.out.println(smallestElement(arr, 0, Integer.MAX_VALUE));

        // Time Complexity - O(N)
    }
}
