package Assignment_Questions;
import java.util.ArrayList;

public class BeautifulArrayList {

    public static ArrayList<Integer> beautifulArrayList(int n) {

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        for(int i=2; i<n; i++) {

            ArrayList<Integer> temp = new ArrayList<>();

            for(Integer elem : ans) {
                if(2*elem <= n) {
                    temp.add(2*elem);
                }
            }

            for(Integer elem : ans) {
                if(2*elem - 1 <= n) {
                    temp.add(2*elem-1);
                }
            }

            ans = temp;

        }

        return ans;
    }

    public static void main(String[] args) {
        
        System.out.println(beautifulArrayList(6));
    }
}