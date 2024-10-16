package Classroom;
import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String str) {

        Stack<Character> s = new Stack<>();
        
        for(int i = 0; i < str.length(); i++) {  // O(n) Time Complexity
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') { // Opening bracket
                s.push(ch);
            }
            else {
                if(s.isEmpty()) {  // Because without opening bracket there can't be a closing bracket
                    return false;
                }
                else {
                    if((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')) {
                        s.pop();
                    }
                }
            }
        }

        if(s.isEmpty()) {   // This case is to handle if any opening bracket is left out in the stack
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        
        String str = "{[([])]}()";
        System.out.println(isValid(str));
    }
}