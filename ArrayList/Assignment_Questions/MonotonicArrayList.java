package Assignment_Questions;
import java.util.ArrayList;
import java.util.Collections;

public class MonotonicArrayList {

    // Linear Time Complexity - O(n)
    public static boolean checkIfMonotonic(ArrayList<Integer> list) {
        
        boolean inc = true;
        boolean dec = true;

        for(int i=0; i<list.size()-1; i++) {
           
            // Not Increasing case
            if(list.get(i) > list.get(i+1))
                inc = false;
            // Not Decreasing case
            if(list.get(i) < list.get(i+1))
                dec = false;
        }

        return inc || dec;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 2, 3);

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 6, 5, 4, 4, 3);

        ArrayList<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, 1, 3, 2);

        System.out.println(checkIfMonotonic(list));
    }
    
}
