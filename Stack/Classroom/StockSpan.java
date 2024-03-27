package Classroom;
import java.util.Stack;

public class StockSpan {

    // Brute Force Approach 
    // Time Complexity - O(n^2)
    public static void brutestockSpan(int stocks[], int span[]) {

        int prevHigh[] = new int[stocks.length];
        prevHigh[0] = 0;
        span[0] = 1;
        
        // Store the prevHigh Values
        for(int i = 1; i < stocks.length; i++) {
            int idx = i;
            for(int j = i; j > 0; j--) {
                if(stocks[j-1] > stocks[i]) {
                    idx = j - 1;
                    break;
                }
                else if (stocks[j-1] >= stocks[i]) {
                    idx = j - 1;
                }
            }
            prevHigh[i] = idx;
        }

        // for(int elem : prevHigh)
        //     System.out.print(elem + " ");
        // System.out.println();

        // Calculate the span
        for(int i = 1; i < span.length; i++) {
            // Formula to calculate stock span
              span[i] = i - prevHigh[i]; 
        }

    }

    // Optimised Approach
    // Linear Time
    public static void optimisedStockSpan(int stocks[], int span[]) {

        Stack<Integer> s = new Stack<>();
        s.push(0);
        span[0] = 1;

        for(int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }

            if(s.isEmpty()) {
                span[i] = i + 1;
            } 
            else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }
    }

    public static void main(String[] args) {
        
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];

        // brutestockSpan(stocks, span);
        optimisedStockSpan(stocks, span);

        // Printing the span values
        for(int elem : span)
            System.out.print(elem + " ");
        System.out.println();

    }
}