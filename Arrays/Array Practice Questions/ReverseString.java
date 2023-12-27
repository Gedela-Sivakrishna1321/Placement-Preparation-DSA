public class ReverseString {
    
    public static String reverseString(String str) {
        // Variable to store the result
        String result = "";

        // Loop from back of the string and append current char to the result string
        for(int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "Gedela_Sivakrishna";
        System.out.println("Reversed String - " + reverseString(str));

        /*
         *      Approach :- 
         *        1) Initialize a String variable to store the result
         *        2) Loop the string from backwards and append the current char to result variable
         *        3) Return result variable
         * 
         *      Complexities :- 
         *          Time Complexity - O(n), Space Complexity - O(1) but O(n) space required to store the result 
         */
    }
}
