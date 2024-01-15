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

    // Check if array is sorted or not
    public static boolean isSorted(int arr[], int i) { // Time Complexity - O(n), Space Complexity - O(n)

        if(i == arr.length - 1) {  
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    // First Occurance of a key in an array
    public static int firstOccurance(int arr[], int key, int i) { // Time Complexity - O(n), Space Complexity - O(n)
        // Base Case
        if(i == arr.length) { 
            return -1;
        }

        if(arr[i] == key) {
            return i;
        }

        return firstOccurance(arr, key, i+1);
    }

    // Last Occurance of an element in an array
    public static int lastOccurance(int arr[], int key, int i) { // Time Complexity - O(n), Space Complexity - O(n)
        
        // Base case
        if(i == arr.length) {
            return -1;
        }

        int isFound = lastOccurance(arr, key, i+1);

        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    // Find x ^ n
    public static int power(int x, int n) { // Time Complexity - O(n), Space Complexity - O(n)

        if( n == 0) {
            return 1;
        }

        // int xpnm1 = power(x, n-1);
        // int xpn = x * xpnm1;
        // return xpn;

        return x * power(x, n-1);
    }

    // Optimised x ^ n
    public static int optimisedPower(int x, int n) { // Time Complexity - O(logn), Space Complexity - O(logn)

        if(n == 0) {
            return 1;
        }

        int halfPower = optimisedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    

    public static void main(String[] args) {
        int n = 10;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(10));
        // System.out.println(sum(5));
        // System.out.println(fib(n));
        // System.out.println(fib(n+1));
        // System.out.println(fib(n+2));
        // System.out.println(fib(n+3));
        // System.out.println(fib(n+4));

        // int arr[] = {1,2,3,4,5};
        // System.out.println(isSorted(arr, 0));

        // int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        // System.out.println(firstOccurance(arr, 5, 0));
        // System.out.println(lastOccurance(arr, 5, 0));

        System.out.println(power(2, 10));

    }
}