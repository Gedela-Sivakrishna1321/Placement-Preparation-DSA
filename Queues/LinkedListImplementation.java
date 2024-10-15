import java.util.*;
public class LinkedListImplementation {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // // static class Queue {

    //     static Node front = null;
    //     static Node rear = null;

    //     // isEmpty() - O(1)
    //     public boolean isEmpty() {
    //         return front == null && rear == null;
    //     }

    //     // add() - O(1)
    //     public void add(int data) {
    //         Node newNode = new Node(data);
    //         if(front == null) {
    //             front = rear = newNode;
    //             return;
    //         }

    //         rear.next = newNode;
    //         rear = newNode;
    //     }

    //     // remove() - O(1)
    //     public int remove() {
    //         if(isEmpty()) {
    //             System.out.println("Queue is empty ");
    //             return -1;
    //         }
    //         int val = front.data;
    //         if(front == rear) {
    //             front = rear = null;
    //         }
    //         else {
    //             front = front.next;
    //         }
    //         return val;
    //     }

    //     // peek() - O(1)
    //     public int peek() {
    //         if(isEmpty()) {
    //             System.out.println("Queue is empty ");
    //             return -1;
    //         }
    //         return front.data;
    //     }
        
    // }

    public static void main(String args[]) {
        // Queue q = new Queue();
        // Queue<Integer> q = new LinkedList<>(); // ArrayDeque()
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
