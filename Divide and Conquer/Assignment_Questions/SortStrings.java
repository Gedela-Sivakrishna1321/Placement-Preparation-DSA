public class SortStrings {

    public static void mergeSort(String arr[], int si, int ei) {
        // Base case
        if(si >= ei) {
            return;
        }

        // Logic
        int mid = si + (ei -si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei) {

        String temp[] = new String[ei - si + 1];
        int i = si; // track left array
        int j = mid+1; // track right array
        int k = 0; // track temp array

        while(i <= mid && j <= ei) {
            if(arr[i].compareTo(arr[j]) < 0 ) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy the left over elements
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        for(k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        } 
    }


    public static void print(String arr[]) {
        for(int i=0; i<arr.length; i++) 
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {


        String arr[] = {"sun", "earth", "mars", "mercury", "venus", "saturn"};
        print(arr);
        mergeSort(arr, 0, arr.length-1);
        print(arr);

        /*  Approach --> MergeSort 
            Time Complexity - O(nLogN) 
            Space Complexity - O(n)
         * 
         */

    }
}