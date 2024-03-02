package Classroom;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Since there can be only 1 head and tail Nodes, We store them seperately
    public static Node head;
    public static Node tail;
    public static int size;

    // Methods, we create different methods for linked list 
    public void addFirst(int data) {
        // Step 1 - Create newNode
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 - newNode.next = head
        newNode.next = head;

        // Step 3 - head = newNode
        head = newNode;

    }

    public void addLast(int data) {
        // Step 1 - Create newNode
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 - tail.next = newNode
        tail.next = newNode;

        // Step 3 - tail = newNode
        tail = newNode;
    }

    public void print() { // Linear time O(n)

        if(head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    
    }

    public void add(int idx, int data) { // O(n) Linear Time to find out the index at which data to be inserted
 
        if(idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;

        int i = 0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() { // O(1) time

        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() { // O(n) Linear time

        if(size == 0) {
            System.out.println("Size is empty ");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        Node temp = head;
        int i = 0;
        // Prev = idx = size - 2
        while(i < size-2) {
            temp = temp.next;
            i++;
        }

        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int search(int key) {

        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }


    public static void main(String[] args) {
      
        LinkedList ll = new LinkedList();
        ll.addFirst(2); // O(1) time to add element to linkedlist
        ll.addFirst(1);
        ll.addLast(4); // O(1) time
        ll.addLast(5);
        ll.add(2, 3);
        ll.print();

        System.out.println(ll.search(4));
        System.out.println(ll.search(242));
    }
    
}
