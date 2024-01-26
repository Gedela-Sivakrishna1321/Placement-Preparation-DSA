public class CalcHCF {

    public static int gcd(int x, int y) {
        // Base case
        if(x == 0)
            return y;
        
        return gcd(y%x, x);
    }

    public static void main(String[] args) {
        System.out.println(gcd(240, 480)); 

        /*     Euclid's Algorithm
         *          Time Complexity - O(log(max(a,b)))
         */
    }
}