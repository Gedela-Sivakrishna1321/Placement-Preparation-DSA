import java.util.Stack;
public class EvalPostfix {
    
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
            case '^':
                return operand1 ^ operand2;
            case '%':
                return operand1 % operand2;
            default:
                return 0;
        }
    }

    public static int evalPostfix(String s) {
        Stack<Integer> stack = new Stack<>();
        int operand1, operand2;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9') {
                stack.push(ch - '0');
            }
            else {
                operand2 = stack.pop();
                operand1 = stack.pop();
                stack.push(calculate(operand1, operand2, ch));
            }
        }
       return stack.peek();
    }
    public static void main(String args[]) {
        String postfix = "562+*43-+89*76/2++543*-987+-564+*323*12/-76+*543+*-";
        int result = evalPostfix(postfix);
        System.out.println(result);
    }
}
