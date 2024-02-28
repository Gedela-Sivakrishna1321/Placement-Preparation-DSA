package Classroom;
import java.util.ArrayList;
import java.util.Collections;

public class PairSum {

    // Brute Force Approach
    public static boolean pairSumI(ArrayList<Integer> list, int target) {
        
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        
        return false;
    }

    // 2 Pointer Approach
    public static boolean pairSumOptimised(ArrayList<Integer> list, int target) {

        int lp = 0;
        int rp = list.size()-1;

        while(lp < rp) {
            // sum == target
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }

            // sum < target
            if(list.get(lp) + list.get(rp) < target) {
                lp++;
            } 
            else { // sum > target
                rp--;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5,6);

        // System.out.println(pairSumI(list, 50));
        System.out.println(pairSumOptimised(list, 12));

    }
    
}
