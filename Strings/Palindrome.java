public class Palindrome {

    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) 
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        String str = "racepar";
        System.out.println(isPalindrome(str));
        /*      Approach - 
         *          Run a loop from i = 0 to str.length()/2, 
         *          check if str.charAt(i) != str.charAt(n-1-i) then return false 
         *                else return true
         *          
         *      Complexities - 
         *          Time Complexity - O(n), Space Complexity - O(1)
         */
    }
}