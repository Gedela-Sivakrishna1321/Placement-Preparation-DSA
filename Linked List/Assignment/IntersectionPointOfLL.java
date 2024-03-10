package Assignment;

public class IntersectionPointOfLL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    // Time Complexity - O(m*n) , where m and n are n.o nodes in the two linked lists ..
    // Space Complexity - O(1)
    public static Node intersectionNode(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        while(temp2 != null) {
            temp1 = head1;
            while(temp1 != null) {
                if(temp1 == temp2) {
                    return temp1;
                }
                temp1 = temp1.next;
            }
            temp2 = temp2.next;
        }

        return new Node(-1);
    }

    public static void main(String[] args) {
        
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node6;
        node6.next = node7;

        node4.next = node5;
        node5.next = node6;

        System.out.println(intersectionNode(node1, node4).data);

        /*
         *      Approach :- 
         *          1) Loop through the second LL
         *          2) Now, run a nested loop of 1st LL inside and check if both the nodes are equal
         *              if(temp1 == temp2) {
         *                    return temp1;
         *              }
         *          3) If, They don't meet then return Node with -1 
         */
    }
    
}
