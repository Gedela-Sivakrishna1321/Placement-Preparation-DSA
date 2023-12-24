import java.util.*;

public class ArrayCC {

    public static void update(int marks[], int nonChangeable) {
        nonChangeable = 243;
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) { // Time Complexity - O(n)
            largest = Math.max(largest, numbers[i]);
        }
        return largest;
    }

    public static void reverse(int marks[]) {
        int first = 0, last = marks.length - 1;

        while(first < last) { // Time Complexity - O(n) , Space Complexity - O(1)
            int temp = marks[last];
            marks[last] = marks[first];
            marks[first] = temp;
        }

    }
    
    public static void printPairs(int numbers[]) {
        for(int i=0; i<numbers.length; i++) { // Time Complexity = O(n^2) , Space Complexity = O(1)
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("("+curr+","+numbers[j]+") ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int marks[] = {81, 95, 100, 76, 93, 65};
         printPairs(marks);
         System.out.println("Total Pairs = " + (marks.length * (marks.length-1))/2);
        
        sc.close();
    }
}