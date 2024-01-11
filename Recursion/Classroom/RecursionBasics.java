public class RecursionBasics {

    public static void printDec(int n) {
       
        // Base Case
        if(n == 1) {
            System.out.println(n);
            return;
        }

        // Calculation
        System.out.print(n + " ");
        
        // Recursive Call
        printDec(n-1);
   
    }

    // Print Increasing Order
    public static void printInc(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int fact(int n) { // Time Complexity - O(n) --> n call are made
        // Base Case 0! = 1            Space Complexity - O(n) --> n call stacks are formed
        if(n == 0) {
            return 1;
        }

        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;
    
    }

    public static void main(String[] args) {
        int n = 10;
        // printDec(n);
        // printInc(n);
        System.out.println(fact(10));
    }
}