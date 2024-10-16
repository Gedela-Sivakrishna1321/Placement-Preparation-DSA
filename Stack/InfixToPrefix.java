import java.util.Stack;
public class InfixToPrefix {

    public static int precedence(char ch) {
        switch(ch) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return -1;
        }
    }

    // Time : O(N)
    //Space : O(N)
    public static String convertToPrefix(String s) {
        StringBuilder prefix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch >= '0' && ch <= '9')) {
                prefix.append(ch);
            }
            else if (ch == ')') {
                stack.push(ch);
            }
            else if (ch == '(') {
                while(!stack.isEmpty() && stack.peek() != ')') {
                    prefix.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while(!stack.isEmpty() && precedence(ch) < precedence(stack.peek())) {
                    prefix.append(stack.pop());
                }
                // If precedence condition satisfies
                stack.push(ch);
            }
        }

        // Add the operators in stack to prefix 
        while(!stack.isEmpty()) {
            prefix.append(stack.pop());
        }

        return prefix.reverse().toString();
    }
    
    public static void main(String args[]) {
        String infix = InfixToPostfix.infix;
        String prefix = convertToPrefix(infix);
        System.out.println("Infix = " + infix);
        System.out.println("Prefix = " + prefix);
    }
}
