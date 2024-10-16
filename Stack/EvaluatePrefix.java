import java.util.Stack;
public class EvaluatePrefix {

    public static int calculate(int operand1, int operand2, char ch) {
        switch(ch) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            case '%':
                return operand1 % operand2;
            default:
                return 0;
        }
    }

    // Time: O(N)
    // Space: O(N)
    public static int evalPrefix(String s) {
        Stack<Integer> stack = new Stack<>();
        int operand1, operand2;
        for(int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9') {
                stack.push(ch - '0');
            }
            else {
                operand1 = stack.pop();
                operand2 = stack.pop();
                stack.push(calculate(operand1, operand2, ch));
            }
        }
        return stack.peek();
    }
    
    public static void main(String args[]) {
        String prefix = "+9*26";
        int result = evalPrefix(prefix);
        System.out.println(result);
    }
}
