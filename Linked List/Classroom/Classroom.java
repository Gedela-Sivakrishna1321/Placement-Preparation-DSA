package Classroom;
import java.util.LinkedList; // Java Collections Framework

public class Classroom {

    public static void main(String[] args) {
        // Create
        LinkedList<Integer> ll = new LinkedList<>();

        // Add elements
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);

        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);
    }
    
}
