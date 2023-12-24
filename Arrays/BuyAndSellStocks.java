public class BuyAndSellStocks {
    
    public static int buyAndSellStocks(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]) { // Profit case
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else { 
                buyPrice = prices[i];
            }
        }
    
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit = " + buyAndSellStocks(prices));

        /*
         *     Approach :- 
         *          1) Initialize a variable buyPrice with Integer.MAX_VALUE, maxProfit -> variable with 0
         *          2) Loop through the prices array and 
         *              check if(buyPrice < today's price) then calculate the profit and update the maxProfit.
         *              else update the buyPrice to today's price
         *          3) Return the maxProfit
         * 
         *     Complexities :- 
         *         Time Complexity - O(n)
         *         Space Complexity - O(1) 
         */
    }
}
