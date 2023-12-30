public class ShortestPath {
    
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++) {
            char ch = path.charAt(i);

            switch(ch) {
                case 'N' : y++;
                           break;
                case 'S' : y--;
                           break;
                case 'E' : x++;
                           break;
                case 'W' : x--;
                           break;
            }
        }
        return (float)Math.sqrt(x*x + y*y);
    }

    public static void main(String[] args) {
        String path = "WNESWWENNS";
        System.out.println("Shortest Path -> " + getShortestPath(path));
        System.out.println("HelloWorld".substring(0,5));
        /*     Approach - 
         *        1) Traverse the string from i = 0 to n and check for each character 
         *           and accordingly increment the x and y values. 
         *              -------- Main Logic -------------       
         *                  North - y++;
         *                  South - y--;
         *                  West  - x--;
         *                  East  - x++; 
         * 
         *      Complexities :- 
         *          Time Complexity - O(n), Space Complexity - O(1)
         */
    }
}
