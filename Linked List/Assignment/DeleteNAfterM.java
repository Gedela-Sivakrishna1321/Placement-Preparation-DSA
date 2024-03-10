package Assignment;

public class DeleteNAfterM {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void deleteNnodesAfterMnodes(Node head, int M, int N) {

        int count = 0;
        Node temp = head;

        while(temp != null) {
            count++;
            if(count == M) {
                Node curr = temp;
                for(int i = 0; i < N; i++) {
                    curr = curr.next;
                }
                if(curr == null ||  curr.next == null) {
                    temp.next = null;
                    break;
                }
                temp.next = curr.next;
                temp = curr.next;
                count = 0;
                continue;
            }

            temp = temp.next;

        }
    }

    public static void print(Node head) {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;

        print(node1);
        deleteNnodesAfterMnodes(node1, 3, 2);
        print(node1);

    }
    
}
