public class PowerOfNUmber {

    // Brute Force Approach
    public static long bruteForceApproach(int num, int exp) {
        long startTime = System.currentTimeMillis();
        long ans = 1;
        System.out.println();
        for (int i = 1; i <= exp; i++) {
            ans *= num;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken - " + (endTime - startTime) + " ms");
        return ans;
    }

    // Optimised Approach - O(Log N) --> Log N time is taken to travel the bits of the power
    public static long optimisedApproach(int a, long n) {
        long ans = 1;
       System.out.println( System.currentTimeMillis());
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }

            a = a * a;
            n = n >> 1;
        }
        System.out.println( System.currentTimeMillis());
        return ans;
    }

  

    public static void main(String[] args) {
        // long range = 1500000000;
        System.out.println(bruteForceApproach(1, 1000000000));
        System.out.println(optimisedApproach(2, 1000000000));
    }
}
