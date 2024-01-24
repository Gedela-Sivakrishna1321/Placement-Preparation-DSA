
public class ContiguousSubStrings {

    //  Time Complexity - O(n^2), Space Complexity - O(1)
    public static int countContiguousSubStrings(String str) {
        
        int count = 0;

        for(int i=0; i<str.length(); i++) {
            for(int j=i; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
        }

        return count;
    }

    public static int optimised(String str) {
        // Store the frequency of characters
        int freq[] = new int[26];

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        // Variable to count the n.o of contiguous sub strings present in the string
        int count = 0;

        for(int i=0; i<freq.length-1; i++) {
            count += (freq[i] * (freq[i]+1))/2;
        }

        return count;
    }
    public static void main(String[] args) {
        String str = "abcab";
        String str2 = "sivakrishna";
        // System.out.println(countContiguousSubStrings(str));
        // System.out.println(countContiguousSubStrings(str2));

        System.out.println(optimised(str2));

        /*       Approach :- 
         *          1) Approach 1 is straight forward approach
         *              Time Complexity - O(n^2), Space Complexity - O(1)             
         * 
         *          2) Approach 2 :- 
         *                    Store the frequency of characters and apply the formula
         *              Time Complexity - O(n), Space Complexity - O(26)
         */
    }
}