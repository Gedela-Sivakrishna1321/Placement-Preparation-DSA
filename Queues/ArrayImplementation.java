public class ArrayImplementation {

    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        public Queue(int n) {
            arr = new int[n];
            size = n;
        }

        // iEmpty() - O(1)
        public boolean isEmpty() {
            return rear == -1;
        }

        // add() - O(1)
        public  void add(int data) {
            if(rear == size-1) {
                System.out.println("Queue is full ");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove() - O(N)
        public int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty ");
                return -1;
            }

            int front = arr[0];
            for(int i = 0; i < rear; i++)
                arr[i] = arr[i+1];
            rear = rear - 1;
            return front;
        }

        // peek() - O(1)
        public int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty ");
                return -1;
            }
            return arr[0];
        }

    }

    static class CircularQueue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        public CircularQueue(int n) {
            arr = new int[n];
            size = n;
            front = rear = -1;
        }

        // isEmpty() - O(1)
        public boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        // isFull() - O(1)
        public boolean isFull() {
            return ((rear + 1) % size) == front;
        }

        // add() - O(1)
        public void add(int data) {
            if(isFull()) {
                System.out.println("Queue is full ");
                return;
            }
            if(front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove() - O(1)
        public int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty ");
                return -1;
            }
            int result = arr[front];
            // Check if queue has only one element
            if(front == rear) {
                front = rear = -1;
            }
            else {
                front = (front + 1) % size;
            }
            return result;
        }

    }
    public static void main(String args[]) {
        // Queue q = new Queue(5);
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while(!q.isEmpty()) {
        //     System.out.println(q.remove());
        // }

        CircularQueue cq = new CircularQueue(3);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.remove();
        cq.remove();
        cq.add(4);
        cq.add(5);

        while(!cq.isEmpty()) {
            System.out.println(cq.remove());
        }
    }
}