package Classroom;
import java.util.ArrayList;
import java.util.Collections;

 class PairSumSortedAndRotated {

    // 2 pointer approach, Linear Time Complexity
    public static boolean pairSumSortedAndRotated(ArrayList<Integer> list, int target) {
        
        int bp = -1; // breaking point

        // Find out breaking point
        for(int i=0; i<list.size()-1; i++) {
            // sorted arrayList condition
            if(list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;
        int n = list.size();

        while(lp != rp) {
            
            int sum = list.get(lp) + list.get(rp);

            // case 1
            if(sum == target) {
                return true;
            }

            // case 2
            if(sum < target) { // Here we use modular arithmetic to travel the arrayList in rotated fashion
                lp = (lp + 1) % n;
            } 
            else { // case 3
                rp = (n + rp -1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 11,15,6,8,9,10);

        System.out.println(pairSumSortedAndRotated(list, 12));
        
    }

}