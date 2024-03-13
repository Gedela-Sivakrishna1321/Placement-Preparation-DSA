package Classroom;
import java.util.ArrayList;
import java.util.Stack;

public class Classroom {

    // static class Stack {

    //     ArrayList<Integer> list = new ArrayList<>();

    //     // IsEmpty()
    //     boolean isEmpty() {
    //         return list.size() == 0;
    //     }

    //     // push()
    //     void push(int data) {
    //         list.add(data);
    //     }

    //     // pop()
    //     int pop() {
    //         if(isEmpty()) {
    //             return -1;
    //         }
    //         int top = list.get(list.size() - 1); // O(1) time
    //         list.remove(list.size() - 1); // O(1) time
    //         return top;
    //     }

    //     // peek()
    //     int peek() {
    //         if(isEmpty()) {
    //             return -1;
    //         }
    //         return list.get(list.size() - 1);
    //     }

    // }

    // static class Node {
    //     int data;
    //     Node next;

    //     Node(int data) {
    //         this.data = data;
    //         this.next = null;
    //     }
    // }

    // // LinkedList stack
    // static class lStack {

    //     public static Node head = null;

    //     // isEmpty()
    //     boolean isEmpty() {
    //         return head == null;
    //     }

    //     // Push()
    //     void push(int data) {
    //         Node newNode = new Node(data);

    //         if(isEmpty()) {
    //             head = newNode;
    //             return;
    //         }

    //         newNode.next = head;
    //         head = newNode;
    //     }

    //     // Pop()
    //     int pop() {

    //         if(isEmpty()) {
    //             return -1;
    //         }

    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }

    //     // Peek()
    //     int peek() {
    //         if(isEmpty()) {
    //             return -1;
    //         }
    //         return head.data;
    //     }

    // }

    public static void main(String[] args) {
        // Stack s = new Stack();

        // s.push(1);
        // s.push(2);
        // s.push(3);

        // // while(!s.isEmpty()) {
        // //     System.out.println(s.pop());
        // // }

        // lStack ls = new lStack();
        // ls.push(1);
        // ls.push(2);
        // ls.push(3);

        // while(!ls.isEmpty()) {
        //     System.out.println(ls.pop());
        // }

        //    Implementing stack using Java Collection Framework
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }
}