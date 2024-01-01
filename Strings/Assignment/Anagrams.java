package Assignment;
import java.util.Arrays;

public class Anagrams {

    // Time Complexity - O(N(Log N))
    public static boolean isAnagrams(String str1, String str2) {
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<arr1.length; i++) {
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    // Time Complexity - O(n), Space complexity - O(256*2)
    public static boolean frequencyOfCharsApproach(String str1, String str2) {
        
        if(str1.length() != str2.length()) 
            return false;
        
        int count1[] = new int[256]; // 256 - because size of the character in Java
        int count2[] = new int[256];
        // Store the frequency of both the strings in two different count arrays
        for(int i=0; i<str1.length() && i<str2.length(); i++) {
            count1[str1.charAt(i)]++;
            count2[str2.charAt(i)]++;
        }

        // Check the frequency arrays
        for(int i=0; i<256; i++) {
            if(count1[i] != count2[i])
                return false;
        }
       
        return true;
    }

    // Time Complexity - O(n), Space Complexity - O(256)
    public static boolean singleHashApproach(String str1, String str2) {
        // Store the frequency of characters of string 1
        char ch[] = new char[256];

        for(int i=0; i<str1.length(); i++) {
            ch[str1.charAt(i)]++;
        }

        for(int i=0; i<str2.length(); i++) {
            if(ch[i] >= 1) {
                ch[i]--;
            }
            if(ch[i] < 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        // String str1 = "listen", str2 = "silent";
        // System.out.println("Are anagrams - " + isAnagrams(str1, str2));
        // System.out.println("Are anagrams - "+ frequencyOfCharsApproach(str1, str2));
        // System.out.println("Are Anagrams - "+singleHashApproach(str1, str2));
        String str1 = "Hello", str2 = str1.intern();
        System.out.println(str1 == str2);

        /*       Approach1 :- 
         *          1) Convert the given two strings into two char arrays
         *          2) Sort the char arrays using Arrays.sort()
         *          3) Now run a for loop and compare the two char arrays
         *              if(arr1[i] != arr2[i]) {
         *               return false;
         *                 }
         *        Complexities :- 
         *          Time Complexity - O(N(Log N)), Space Complexity - O(N) --> Two char arrays are being used
         *          --> O(N(Log N)) to sort the arrays
         * 
         *      Approach 2 :- 
         *          1) Declare two char arrays of size [256]
         *          2) Loop through the two strings and store the frequency of characters 
         *          3) Now, Check the two char arrays & if (arr1[i] != arr2[i]) return false
         * 
         *      Complexities :- 
         *          Time Complexity - O(N), Space Complexity - O(2*256) --> Because two char arrays of size 256 
         *          are used.
         * 
         *      Approach 3 :- 
         *          1) Declare one char array of size 256
         *          2) Store the frequency of characters of string 1
         *          3) Now, Run another loop for string 2, 
         *             Decrease the frequency of each character from the char array.
         *           if anywhere, the frequency becomes < 1, then they are not anagrams
         * 
         *      Complexities :- 
         *          Time Complexity - O(N), Space Complexity - O(256) --> Because char array of size 256
         *          is used.
         */
    }
    
}
 