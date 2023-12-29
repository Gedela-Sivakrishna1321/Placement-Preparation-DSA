import java.util.Arrays;

public class AllTripletsSumEqualsZero {
    
    public static void findAllTripletsSumEqualZero(int arr[]) {
        // Sort the array First
        Arrays.sort(arr);

        // Run a loop 
        for(int i=0; i<arr.length-1; i++) {
            int l = i + 1, r = arr.length - 1;
            int curr = arr[i];
            while(l < r) {
                int sum = curr + arr[l] + arr[r];
                if(sum == 0) {
                    System.out.println("("+i+","+l+","+r+")");
                }
                else if ( sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        findAllTripletsSumEqualZero(arr);
    }
}
