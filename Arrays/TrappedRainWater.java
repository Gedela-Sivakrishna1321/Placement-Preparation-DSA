public class TrappedRainWater {
    
    public static int trappedRainWater(int heights[]) {
        int n = heights.length;
        
        // Helper Arrays
        int leftMax[] = new int[heights.length];
        int rightMax[] = new int[heights.length];

        // Calculate LeftMaxBoundry
        leftMax[0] = heights[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(heights[i], leftMax[i-1]);
        }

        // Calculate RightMaxBoundry
        rightMax[n-1] = heights[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(heights[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        // Calculate Trapped Rain Water
        for(int i=0; i<n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - heights[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int numbers[] = {4, 3, 6, 7, 5, 1, 2, 5};
        System.out.println("Trapped Rain Water = " + trappedRainWater(numbers));

        /*
         *   Approach :- 
         *          1) Calculate the leftMax Boundry and store in an auxilary array
         *          2) Calculate the rightMax Boundry and store in an auxilary array
         *          3) Calculate the Trapped Rain Water 
         * 
         *   Formula's :- 
         *         Water Level = leftMax[i] - rightMax[i]
         *         Trapped_Water = (Water_Level - heights[i]) * width
         * 
         *   Complexities :- 
         *         Time Complexity - O(n)
         *         Space Complexity - O(n)
         */
  
      }
}
