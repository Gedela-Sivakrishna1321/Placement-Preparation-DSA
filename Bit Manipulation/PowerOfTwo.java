public class PowerOfTwo {
    
    public static boolean isPowerOfTwo(int num) {
        // condition :- n & (n-1) == 0 then It is power of 2
        return (num & num-1) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
    }
}
