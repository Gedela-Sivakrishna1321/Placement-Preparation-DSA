public class TilingProblem {

    public static int tilingProblem(int n) {
        // Base case
        if(n == 0 || n == 1) {
            return 1;
        }

        // N.o of vertical Ways
        int verticalWays = tilingProblem(n-1);

        // N.o of horizantal Ways
        int horizantalWays = tilingProblem(n-2);

        // Total Ways
        int totalWays = verticalWays + horizantalWays;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(5));

        /*     Approach :-
                    // Base Case 
         *         1) Base case is n == 0 || n == 1, i.e when n = 0, there is no way to place tiles and finding 
         *          that there is no way to place a tile is also a way. When n = 1, there is only 1 way to place 
         *          the tile
         *        2) Now, Calculate the n.o of verticalWays possible to place the tile after placing 1 tile.
         *           Here, We assume that we placed one tile vertically son now we have to fill (n-1) Length
         *               ----> int verticalWays = tilingProblem(n-1)
         *        3) Now, Calculate the n.o of horizantalWays possible to plcae the tile after placing one 
         *           tile horizantally, So we are left with 2 * (n-2 ) floor
         *              ----> int horizantalWays = tilingProblem(n-2)
         *        4) Now, TotalWays = verticalWays + horizantalWays
         *        5) Return totalWays
          */
    }
    
}
