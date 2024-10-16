package Classroom;
import java.util.Stack;
public class DuplicateParenthesis {

    // Time Complexity - O(n)
    public static boolean isDuplicate(String str) {

        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            
            char ch = str.charAt(i);

            // closing bracket case
            if(ch == ')') {
                
                int count = 0;
                while(s.peek() != '(') {
                    count++;
                    s.pop();
                }

                if(count < 1) {
                    return true; // Duplicate Parenthesis exist in this case
                }

                s.pop();

            } else { // opening case

                s.push(ch); // push the opening bracket, operand or operators into the stack
           
            }

        }

        return false;
    }
    public static void main(String[] args) {
        
        String str = "((a + b))";
        String str2 = "((a + b) + (c + d))";
        System.out.println(isDuplicate(str));

    }
    
}
