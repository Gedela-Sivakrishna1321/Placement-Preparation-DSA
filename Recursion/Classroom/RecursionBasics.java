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

    // Sum of first N natural Numbers
    public static int sum(int n) {
       
        // Base Case
        if(n == 1) {
            return n;
        }

        int Snm1 = sum(n-1);
        int Sn = n + Snm1;
      
        return Sn;
    }

    // Nth Fibonaaci Number
    public static int fib(int n) {
        // Base Case
        if(n == 0 || n == 1) {     // Space Complexity - O(n) --> The maximum height of the call stack can go upto n
            return n;              // Time Complexity - O(2^n) --> Exponential Complexity
        }                          // Check the notes for the better visualization of Tree 

        int fbnm1 = fib(n-1);
        int fbnm2 = fib(n-2);
        int fbn = fbnm1 + fbnm2;
        return fbn;
    }

    public static void main(String[] args) {
        int n = 10;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(10));
        // System.out.println(sum(5));
        System.out.println(fib(n));
        System.out.println(fib(n+1));
        System.out.println(fib(n+2));
        System.out.println(fib(n+3));
        System.out.println(fib(n+4));
    }
}