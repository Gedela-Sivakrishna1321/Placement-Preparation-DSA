package Assignment_Questions;
import java.util.ArrayList;
import java.util.Collections;

public class MostFrequentNumberFollowingKey {

    public static int mostFrequentNumberFollowingKey(ArrayList<Integer> list, int key) {
        // Find out the largest element 
        int maxValue = Integer.MIN_VALUE;

        for(Integer currElem : list) {
            maxValue = Math.max(maxValue, currElem);
        }

        // Frequency array 
        int count[] = new int[maxValue+1];

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i-1) == key) {
                int target = list.get(i);
                count[target]++;
            }
        }

        int maxFreq = 0;
        int ans = -1;

        for(int i = 0; i < count.length; i++) {
            if(count[i] > maxFreq) {
                maxFreq = count[i];
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 100, 200, 1, 100);

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 2, 2, 2, 2, 3);


        System.out.println(mostFrequentNumberFollowingKey(list, 2));
    }
    
}
