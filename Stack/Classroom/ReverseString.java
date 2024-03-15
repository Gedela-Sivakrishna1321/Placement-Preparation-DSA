package Classroom;
import java.util.Stack;

public class ReverseString {
    
    // Time Complexity - O(n)
    // Space Complexity - O(n) because we are using stack data structure
    public static String reverseString(String str) {

        Stack<Character> s = new Stack<>();
        int idx = 0;

        // Insert all the characters in the stack
        while(idx < str.length()) {
            char ch = str.charAt(idx);
            s.push(ch);
            idx++;
        }

        // StringBuilder saves time than using string 
        StringBuilder result = new StringBuilder();

        while(!s.isEmpty()) {
            char ch = s.pop();
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String str = "Sivakrishna";
        String result = reverseString(str);
        System.out.println(result);

    }
}
