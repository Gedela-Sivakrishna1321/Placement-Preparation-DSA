package Assignment_Questions;
import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumbers {

    public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> list) {

        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<list.size(); i++) {
            
            int elem = list.get(i);

            if((freq(elem, list) == 1) && !isPresent(elem-1, list) && !isPresent(elem+1, list)) 
                result.add(elem);
        }

        return result;
    }

    public static int freq(int elem, ArrayList<Integer> list) {
        int count = 0;
        for(Integer currElem : list) {
            if(currElem == elem)
                count++;
        }
        
        return count;
    }

    public static boolean isPresent(int elem, ArrayList<Integer> list) {
        for(Integer currElem : list) {
            if(currElem == elem)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 6, 8);

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 3, 5, 3);

        System.out.println(lonelyNumbers(list2));
    }
    
}
