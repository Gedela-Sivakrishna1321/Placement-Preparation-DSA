public class BinarySearch {
    
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end) { // Time Complexity - O(log n)
            int mid = start + (end-start)/2;

            if(numbers[mid] == key) {
                return mid;
            }

            if(numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;

        System.out.println("Element found at index : " + binarySearch(numbers, key));
    }
}
