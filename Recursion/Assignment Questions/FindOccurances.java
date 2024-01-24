public class FindOccurances {

    public static void findOccurances(int arr[], int i, int key) {
        //Base Case
        if(i == arr.length) {
            System.out.println();
            return;
        }

        // Logic
        if(arr[i] == key) {
            System.out.print(i + " ");
        } 
        // Recursive call
        findOccurances(arr, i+1, key);
    }
    public static void main(String args[]) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        findOccurances(arr, 0, 2);
    }
}