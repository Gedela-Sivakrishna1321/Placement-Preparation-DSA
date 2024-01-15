public class DuplicatesInString {

    public static void removeDuplicates(String str, StringBuilder sb, int idx, boolean[] map) {
        // Base Case 
        if(idx == str.length()) {
            System.out.println(sb);
            return;
        }

        // Logic of the function
        char curr = str.charAt(idx);

        if(map[curr - 'a'] == false) {
            sb.append(curr);
            map[curr - 'a'] = true;
        } 

        // Recursive call
        removeDuplicates(str, sb, idx+1, map);

    }
    public static void main(String[] args) {
        
        String str = "appnnacollege";
        removeDuplicates(str, new StringBuilder(), 0, new boolean[26]);

        /*      Approach:-
         *          1) Declare a stringBuilder, Boolean Map[]
         *          2) Now Pass the values to the function removeDuplicates(String str, StringBuilder sb, int idx, map)
         *          3) Base case, When the idx equals string Length, return from the function
         *          4) Logic of the function :- 
         *              check if current char is marked as true in the boolean map, then call the recursive function
         *              for next index 
         *              else 
         *              append the current char to the stringBuilder & mark the index of the char in the map
         *              as true
         *          5) When base case is hit, print the stringBuilder and return from the function
         */
    }
}