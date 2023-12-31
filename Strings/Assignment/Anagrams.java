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

    // Time Complexity - O(n), Space complexity - O(1)
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

    public static void main(String[] args) {
        String str1 = "care", str2 = "race";
        // System.out.println("Are anagrams - " + isAnagrams(str1, str2));
        System.out.println("Are anagrams - "+ frequencyOfCharsApproach(str1, str2));
    }
    
}
