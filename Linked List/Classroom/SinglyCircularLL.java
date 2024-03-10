package Classroom;

public class SinglyCircularLL {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // addFirst
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        newNode.next = tail.next;
        tail.next = newNode;
        head = newNode;
        size++;

    }

    // addLast
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;

    }

    // add(idx, data)
    public void add(int idx, int data) {
        if(!(idx >= 0 && idx <= size)) {
            System.out.println("Invalid index position !");
            return;
        }

        if(idx == 0) {
            addFirst(data);
            return;
        }

        if(idx == size) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for(int i = 0; i < idx-1; i++)
                temp = temp.next;
        
        newNode.next = temp.next;
        temp.next = newNode;
        size++;

    }

    // removeFirst
    public int removeFirst() {
        if(size == 0) {
            System.out.println("Circular LL is empty !");
            return Integer.MIN_VALUE;
        }

        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        tail.next = head.next;
        head = head.next;
        size--;
        return val;
    }

    // removeLast
    public int removeLast() {
        if(size == 0) {
            System.out.println("Circular LL is empty !");
            return Integer.MIN_VALUE;
        }

        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        Node temp = head;
        while(temp.next != tail)
            temp = temp.next;
        
        int val = temp.next.data;
        temp.next = head;
        size--;
        return val;
    }

    // remove(int idx)
    public int remove(int idx) {
        if(!(idx >= 0 && idx < size)) {
            System.out.println("Invalid index position !");
            return Integer.MIN_VALUE;
        }

        if(idx == 0) {
            return removeFirst();
        }

        if(idx == size-1) {
            return removeLast();
        }

        Node temp = head;
        Node prev = null;

        for(int i =0; i <= idx-1; i++) {
            prev = temp;
            temp = temp.next;
        }
        int val = temp.data;
        prev.next = temp.next;
        size--;
        return val;
    }

    // Print
    public void print() {
        Node temp = head;
        while(temp.next != head) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data + "->" + head.data);
    }

    public static void main(String[] args) {
        SinglyCircularLL cll = new SinglyCircularLL();
        cll.addLast(1);
        cll.addLast(2);
        cll.addLast(3);
        cll.addLast(4);
        cll.addLast(5);

        cll.print();
        System.out.println(size);

        // cll.removeFirst();
        // cll.print();
        // System.out.println(size);

        // cll.removeLast();
        // cll.print();
        // System.out.println(size);

        // cll.remove(1);
        // cll.print();
        // System.out.println(size);

        cll.add(1, 11);
        cll.print();
        System.out.println(size);
    }
    
}
