
public class PowerOfNumber {

    public static int calcPower(int base, int power) { // Time Complexity - O(n), Space Complexity - O(n)
        // Base case
        if(power == 1) {
            return base;
        }

        // Recursive call
        return base * calcPower(base, power-1);

    }

    public static int calcPowerOptimised(int base, int power) { // Time Complexity - O(log N), Space Complexity - O(Log N)

        //Base case
        if(power == 0) {
            return 1;
        }

        // Logic of the function
        int halfPow = calcPower(base, power/2);
        int fullPow = halfPow * halfPow;

        if((power & 1 ) == 1) {
            fullPow *= base;
        }

        return fullPow;
    }

    public static void main(String[] args) {
        
        System.out.println(calcPower(10, 3));
        System.out.println(calcPowerOptimised(14, 3));

        /*     Optimised Approach :- 
         *          1) Here we are calculating the half power value using recursion function
         *          2) Now multiply it twice to get the full power value
         *          3) If power is odd then multiply by base one more time
         *          4) return the fullPowerValue
         *      The code became optimsed by calling the function only log N times and log N stack calls 
         *      will be created in the memory. 
         */
    }
    
}
