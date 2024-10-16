import java.util.HashMap;
import java.util.Set;

public class Classroom {

    public static void main(String args[]) {

        HashMap<String, Integer> map = new HashMap<>();

        // put operation - O(1)
        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);

    //     System.out.println(map);

    //     // get operation - O(1)
    //     System.out.println(map.get("India"));
    //     System.out.println(map.get("Indonesia")); // If key not present then returns null value

    //     // contains operation - O(1)
    //     System.out.println(map.containsKey("India")); // returns true, If value is present
    //     System.out.println(map.containsKey("Indonesia")); // returns false, If value is not present

    //     // remove operation - O(1)
    //    System.out.println(map.remove("India"));
    //    System.out.println(map);

    //    // size, clear, isEmpty
    //    System.out.println(map.size());
    //    map.clear();
    //    System.out.println(map.isEmpty());

        // Set<String> keys = map.keySet();

        // for (String k : keys) {
            
        //     System.out.println("key=" + k + ", value = " + map.get(k));
        // }
        
        // // entrySet() - converts HashMap to a set
        // System.out.println(map.entrySet());
        
    }
}