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
            System.out.print(temp.data + "->");
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

    // Time complexity - O(n)
    // Space complexity - O(n) --> Because of the call stack
    public int recSearch(Node head, int key) {  
        // Base case
        if(head == null) {
            return -1;
        }

        if(head.data == key) {
            return 0;
        }

        int idx = recSearch(head.next, key);

        if(idx == -1) {
            return -1;
        }
        
        return idx + 1;
    }

    // Time complexity - O(n)
    public void reverse() { 
        // Take 3 variables
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            // Perform 4 steps
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // Time complexity - O(n)
    public int removeNthNodeFromEnd(int n) {

        if(n == size) {
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        Node temp = head;
        int idx = size - n;

        for(int i=0; i<idx-1; i++ ) {
            temp = temp.next;
        }

        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public Node findMid(Node Head) {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next; // +1 step
            fast = fast.next.next; // +2 step
        }

        return slow;
    }

    // Time complexity - O(n)
    public boolean isPalindrome() {
        // Corner case
        if( head == null || head.next == null) {
            return true;
        }

        // Find the mid
        Node midNode = findMid(head);

        // Reverse the half Linked List
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        // Check if left half == right half
        while(right != null) {
            if(left.data != right.data) 
                return false;
            
            left = left.next;
            right = right.next;
        }

        return true;
    }

    // Time Complexity - O(n)
    public boolean isCycleExist() { // Floyd's Cycle Algorithm

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {

            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if(slow == fast) {
                return true;
            }
        }

        return false;
    }

    public void removeCycle() {
        // Detect loop 
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; // + 1 step
            fast = fast.next.next; // + 2 step
            if(slow == fast)
                break;
        }

        // slow = head
        slow = head;
        
        // Prev Node to track previous of fast
        Node prev = null;

        while(slow != fast) {
            slow = slow.next; // +1 step
            prev = fast;
            fast = fast.next; // +1 step
        }

        // Point the LastNode.next = null
        prev.next = null;
    }

    public Node getMidNode(Node head) {
        // Find the mid Node
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next; // +1 step
            fast = fast.next.next; // +2 step
        }
        return slow;
    }

    public Node mergeSort(Node head) { // Time Complexity - O(nlogn)
        // Base case
        if(head.next == null || head == null) {
            return head;
        }

        Node mid = getMidNode(head);

        Node right = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(right);
        return merge(newLeft, newRight);
    }

    public Node merge(Node head1, Node head2) {

        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            if(head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } 
            else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public void zigzag() {
        // Find the mid
        Node mid = getMidNode(head);
        Node right = mid.next;
        mid.next = null;

        // Reverse the second half
        Node prev = null; // 3 variables & 4 steps
        Node curr = right;
        Node next ;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node RH = prev;
        Node LH = head;
        Node nextL, nextR;
        
        // Alternate Merging
        while(LH != null && RH != null) {
            // zig-zag steps
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;

            // Update
            LH = nextL;
            RH = nextR;
        }

    }

    public Node intersectionNode(Node head1, Node head2) {
        
        Node temp1 = head1;
        Node temp2 = head2;

        while(temp2 != null) {
            temp1 = head1;
            while(temp1 != null) {
                if(temp2 == temp1) {
                    return temp2;
                }
                temp1 = temp1.next;
            }
            temp2 = temp2.next;
        }

        return new Node(-1);
    }


    public static void main(String[] args) {
      
        LinkedList ll = new LinkedList();
        // ll.addFirst(1); // O(1) time to add element to linkedlist
        // ll.addLast(2);
        // ll.addLast(97);
        // ll.addLast(97);
        // ll.addLast(2); // O(1) time
        // ll.addLast(1);
        // ll.print();

        // System.out.println(ll.recSearch(head,4));
        // System.out.println(ll.recSearch(head,242));

        // ll.reverse();
        // ll.print();

        // System.out.println(ll.removeNthNodeFromEnd(2));
        // ll.print();
        // System.out.println(ll.isPalindrome());
        // head = new Node(1);
        // Node node2 = new Node(2);
        // head.next = node2;
        // Node node3 = new Node(3);
        // node2.next = node3;
        // Node node4 = new Node(4);
        // node3.next = node4;
        // Node node5 = new Node(5);
        // node4.next = node5;
        // Node node6 = new Node(6);
        // node5.next = node6;
        // Node node7 = new Node(7);
        // node6.next = node7;
        // node7.next = node2;
        
        // ll.print();
        // System.out.println(ll.isCycleExist());
        // ll.removeCycle();
        // ll.print();

        // ll.addLast(5);        
        // ll.addLast(4);        
        // ll.addLast(3);        
        // ll.addLast(2);        
        // // ll.addLast(1);
        
        // ll.print();

        // ll.head = ll.mergeSort(head);
        // ll.print();

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addLast(6);

        // ll.print();
        // ll.zigzag();
        // ll.print();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node6;
        node6.next = node7;

        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node4.next = node5;
        node5.next = node2;

        System.out.println(ll.intersectionNode(node1, node4).data);
    }
    
}
