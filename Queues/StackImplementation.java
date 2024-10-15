import java.util.Stack;
public class StackImplementation {
    
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // isEmpty() - O(1)
        public boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        // add() - O(1)
        public void add(int data) {
           s1.push(data);
        }

        // remove() - O(N) in worst case, Average case - O(1)
        public int remove() {
            if(isEmpty()) {
                System.out.println("Stack is empty ");
                return -1;
            }
           
            if(s2.isEmpty()) {
                while(!s1.isEmpty())
                    s2.push(s1.pop());
            }
           return s2.pop();
        }

        // peek() - O(N) in worst case, Average case - O(1)
        public int peek() {
            if(isEmpty()) {
                System.out.println("Stack is empty ");
                return -1;
            }
            
            if(s2.isEmpty()) {
                while(!s1.isEmpty())
                    s2.push(s1.pop());
            }

            return s2.peek();
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        // while(!q.isEmpty()) {
        //     System.out.println(q.remove());
        // }
        q.remove();
        System.out.println(q.peek());

    }
}
