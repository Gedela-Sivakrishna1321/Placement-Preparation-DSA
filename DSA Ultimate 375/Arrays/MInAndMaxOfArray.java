package Arrays;

public class MInAndMaxOfArray {

    public static void main(String[] args) {

        int arr[] = {243, 234, 123, 897, 453, 1098, 836};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int elem : arr) {
            min = Math.min(elem, min);
            max = Math.max(elem, max);
        }

        System.out.println("Minimum element - " + min);
        System.out.println("Maximum element - " + max);
        
    }
}