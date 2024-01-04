public class BitManipulation {


    public static int clearBitsInRange(int num, int i, int j) {
        int a = ((~0) << (j+1));
        int b = (1 << i) - 1;
        int BitMask = a | b;
        return num & BitMask;
    }

    public static void main(String[] args) {
        // System.out.println(5&6);
        // System.out.println(5 ^ 6);
        // System.out.println(~(-1));

        // Bitwise Left Shift
        // System.out.println(5 << 2);

        // Bitwise Right Shift
        // System.out.println(6 >> 1);

        System.out.println("After clearing Bits in range - " + clearBitsInRange(63, 1, 3));
    }
}