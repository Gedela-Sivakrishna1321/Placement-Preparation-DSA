public class CalcLCM {

    public static int gcd(int x, int y) { // Time Complexity - O(log(max(a,b)))
        // Base case
        if(x == 0)
            return y;
        
        return gcd(y%x, x);
    }

    public static void main(String[] args) {
        
        int hcf = gcd(10, 15);
        System.out.println((10 * 15)/hcf);
    }
    
}
