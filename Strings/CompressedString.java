public class CompressedString {
    
    public static String compress(String str) {

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            
            Integer count = 1;

            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }

            sb.append(str.charAt(i));

            if(count > 1)
                sb.append(count.toString());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println("Compressed string - " + compress(str));

        /*      Approach :- 
         *          1) Declare a StringBuilder variable to store the compressed string
         *          2) Run a for loop from i = 0 to str.length, initialize a count type Integer object variable, 
         *             count = 1. Run another while loop inside it unitl the following condition is true
         *             (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)), If the condition satisfies 
         *             then increment the counter & loop variable.
         *          3) Append the current character to result stringbuilder
         *          4) Now, Check if (count > 1) then append the count also to result stringBuilder
         * 
         *      Time Complexity - O(n), Space Complexity - (1) 
         */
    }
}
