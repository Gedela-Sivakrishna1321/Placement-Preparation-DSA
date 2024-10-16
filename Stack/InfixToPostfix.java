import java.util.Stack;
public class InfixToPostfix {
    public static String infix = "k+L-M*N+(O^P)*W/U/V*T+Q";
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

    public static char associativity(char ch) {
        return ch == '^' ? 'R' : 'L';
    }

    // Time : O(N)
    // Space: O(N)
    public static String convertToPostfix(String s) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                postfix.append(ch);
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') { // Pop all characters until open brace is encountered
                    postfix.append(stack.pop());
                }
                stack.pop(); // Also pop the open brace
            }
            else {
                while(!stack.isEmpty() && (precedence(ch) <= precedence(stack.peek()) && associativity(ch) == 'L')) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Now, If stack has any characters left in it, add them to postfix expression
        while(!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }
    public static void main(String args[]) {
       
        String postfix = convertToPostfix(infix);
        System.out.println("Infix = " + infix);
        System.out.println("Postfix = " + postfix);
    }
}